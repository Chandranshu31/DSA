class Solution {
    public int maxSum(int[] nums) {
        int largestDigit[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int largest=-1;
            while(curr>0){
                int lastD=curr%10;
                largest=Math.max(lastD,largest);
                curr=curr/10;
            }
            largestDigit[i]=largest;
        }
        int maxSum=-1;
         HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(largestDigit[i], k -> new ArrayList<>()).add(nums[i]);
        }
             for (int digit : map.keySet()) {
            ArrayList<Integer> list = map.get(digit); // get all the numbers with largest digit as Digit into list
            if (list.size() >= 2) {
                Collections.sort(list); // just to get largest two
                int sum = list.get(list.size() - 1) + list.get(list.size() - 2);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;

        
    }
}