import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (Math.abs(nums[i] - nums[j]) == k) {
                    int small = Math.min(nums[i], nums[j]);
                    int large = Math.max(nums[i], nums[j]);
                    String pairKey = small + "," + large;
                
                    if (!seen.contains(pairKey)) {
                        seen.add(pairKey);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
