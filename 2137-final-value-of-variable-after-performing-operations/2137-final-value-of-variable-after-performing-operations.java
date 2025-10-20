class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String a="X++";
        String b="++X";
        String c="--X";
        String d="X--";
        int res=0;
        for(String op:operations){
            if(op.equals(a) || op.equals(b)){
                res+=1;
            }else if(op.equals(c)||op.equals(d)){
                res-=1;
            }
        }
        return res;
        
    }
}