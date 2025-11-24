class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int dig=0;
        for(int bit:nums){
            dig=(dig*2+bit)%5; // get the bin rep and base 10
            boolean isDiv=(dig==0);
            res.add(isDiv);
        }
        return res;
    }
}