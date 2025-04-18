class Solution {
    public String reverseWords(String s) {
        String words[]=s.split("\\s+");
        StringBuilder res= new StringBuilder();  /// regex split
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            char arr[]=curr.toCharArray();
            int j=0;
            int k=arr.length-1;
          
            while(j<k){
                char temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
            }
            String temp = new String(arr);
            res.append(temp); 
            if(i!=words.length-1){  // to avoid using whitespace at the end. we dont want it
             res.append(" "); // in othercases to maintain the whitespace betnween two words of a string
            }
        }
        return res.toString();
        
    }
}

// if we use a string in place of stringbuilder then it will get submitted but a bit more processing time as 
// every time at s+= operation it will create a new object instead of resuing the buffer like stringbuilder