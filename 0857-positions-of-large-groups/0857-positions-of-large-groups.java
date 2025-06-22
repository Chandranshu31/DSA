class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            char curr=s.charAt(i);
            int len=1;
            int j=i+1;
            while(j<s.length() && s.charAt(j)==curr){
                j++;
                len++;
            }
            if(len>=3){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j-1);
                res.add(temp);
                i=j;
            }else{
            i++;
            }

        }
        return res;
        
    }
}