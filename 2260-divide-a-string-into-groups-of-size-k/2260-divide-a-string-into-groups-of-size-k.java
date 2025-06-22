class Solution {
    public String[] divideString(String s, int k, char fill) {
       //char arr[]=s.toCharArray();
       List<String> temp = new ArrayList<>();
       int i=0;
       while(i<s.length()){
        StringBuilder t = new StringBuilder();
        for(int j=0;j<k;j++){
            if(i<s.length()){
                t.append(s.charAt(i));
            }else{
                t.append(fill);
            }
            i++;
        }
        temp.add(t.toString());
       }

       int n=temp.size();
       String res[] = new String[n];
       for(int p=0;p<n;p++){
        res[p]=temp.get(p);
       }

       return res;


        
    }
}