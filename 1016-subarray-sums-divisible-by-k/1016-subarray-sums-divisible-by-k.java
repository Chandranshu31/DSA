class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int prefixSum=0;
      int count=0;
      map.put(0,1);

      for(int num:nums){
        prefixSum+=num;
        int rem=prefixSum%k;
        if (rem < 0) rem += k;
        if(map.containsKey(rem)){
            count+=map.get(rem);
        }
        map.put(rem,map.getOrDefault(rem,0)+1);
      }
      return count;
    }
}

//two prefix sums with the same remainder modulo k give a valid subarray between them.
/**For every new prefix[r],

Compute its remainder rem = prefix[r] % k.

Look into a HashMap that tells us:
“How many times have I seen this remainder before?”

If we’ve seen it x times before, then we can form x new subarrays ending at r that are divisible by k */