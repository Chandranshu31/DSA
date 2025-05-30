class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int n=operations.length;
        for(int i=0;i<n;i++){
            int a=operations[i][0]; // it exists in nums
            int b=operations[i][1]; // the val with which we want it to replace

            int idx=map.get(a);  // get the idx at which old val exists
            nums[idx]=b; // in nums replace the ld value with the new value
            map.remove(a); // remove the old value the key from map
            map.put(b,idx);  // put the updated val with idx in map
         }

        return nums;
    }

}

/**
Another approach but good for small cases only
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }

        int n=operations.length;
        for(int i=0;i<n;i++){
            int a=operations[i][0]; // it exists in nums
            int b=operations[i][1]; // the val with which we want it to replace
            for(int k: map.keySet()){
                if(map.get(k)==a){
                    map.put(k,b);
                }
            }
        }

        int res[]=new int[nums.length];
        for(int k:map.keySet()){
            res[k]=map.get(k);
        }
        return res;
    }
}
 */