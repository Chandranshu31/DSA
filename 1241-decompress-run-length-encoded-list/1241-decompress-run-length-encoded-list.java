class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            while(freq>0){
                tmp.add(val);
                freq--;
            }
        }
        int ans[]=new int[tmp.size()];
        for(int i=0;i<tmp.size();i++){
            ans[i]=tmp.get(i);
        }
        return ans;
        
    }
}