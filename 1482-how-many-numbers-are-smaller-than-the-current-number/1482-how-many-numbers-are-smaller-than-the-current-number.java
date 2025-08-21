class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) { int n=nums.length;
      //Arrays.sort(nums);
      HashMap<Integer,Integer> map = new HashMap<>();
      int sorted[]=new int[n];
      for(int i=0;i<n;i++){
        sorted[i]=nums[i];
      }
      Arrays.sort(sorted);  //[1,2,2,3,8]

      for(int i=0;i<n;i++){
        if(map.containsKey(sorted[i])) continue;
        else map.put(sorted[i],i);
      }
      // map is like 1->0, 2->1, 3->3, 8->4
      int res[]=new int[n];
      for(int i=0;i<n;i++){
        res[i]=map.get(nums[i]);
      }
      return res;
    }
}