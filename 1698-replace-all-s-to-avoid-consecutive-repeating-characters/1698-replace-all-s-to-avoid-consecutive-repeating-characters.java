class Solution {
    public String modifyString(String s) {
        char arr[]= s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='?'){
                for(char c='a';c<='c';c++){
                    if((i>0 && arr[i-1]==c) || (i<arr.length-1 && arr[i+1]==c)){  // skip c==to any one neighbour only
                        continue;
                    }else{
                        arr[i]=c;
                         break;
                    }
                }
            }
        }
        return new String(arr);
        
    }
}