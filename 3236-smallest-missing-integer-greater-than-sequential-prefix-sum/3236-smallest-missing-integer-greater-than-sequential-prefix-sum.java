class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int seqSum=nums[0];  // given that  In particular, the prefix consisting only of nums[0] is sequential.
        int i=1;
        while(i<n && nums[i]==nums[i-1]+1){  // the moment the loop termiates, the sequence gets broken
            seqSum+=nums[i];
            i++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        // now we need to find out  smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
        while(set.contains(seqSum)){  // if set contains the seqSum curr value, means arrcontains so +1 if same for next new val again +1
        // repeat the process until we get a numb that is not in set, i.e nums
            seqSum++;
        }

        return seqSum;
        
        
    }
}