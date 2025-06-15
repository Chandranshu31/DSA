class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            char curr=nums[i].charAt(i);
            if(curr=='0'){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        return sb.toString();  
        
    }
}