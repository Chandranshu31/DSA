class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> res = new ArrayList<>();
        for(String curr : words){
            StringBuilder temp = new StringBuilder();
            char arr[]=curr.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==separator){
                    if(temp.length()>0){ // only if there is a valid string
                    res.add(temp.toString());
                    temp= new StringBuilder();
                    }
                }else{
                temp.append(arr[i]);
                }
            }
             if (temp.length() > 0) {               // add last part if not empty, to avoid adding empty strings
                res.add(temp.toString());
            }
        }
        return res;
        
    }
}