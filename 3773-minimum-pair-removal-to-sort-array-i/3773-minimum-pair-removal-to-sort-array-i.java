class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int num:nums){
            temp.add(num);
        }
        if(isSorted(temp)){ // if its already sorted return 0 no need to sort it again
            return 0;
        }
        int count=0; // to count the min number of operations
        
        while(!isSorted(temp)){
            int n=temp.size();
            int a=0;
            int b=1;
            int minPairSum=Integer.MAX_VALUE;
            int minIdx1=-1;
            int minIdx2=-1;
            while(b<n && a<n-1){
                int pair1=temp.get(a);
                int pair2=temp.get(b);
                int pairSum=pair1+pair2;
                if(pairSum<minPairSum){
                    minPairSum=pairSum;
                    minIdx1=a;
                    minIdx2=b;
                }
                a++;
                b++;
            }
            temp.remove(minIdx2);
            temp.remove(minIdx1);
            temp.add(minIdx1, minPairSum);
            count++;

        }
        return count;
        
    }
    public boolean isSorted(List<Integer> nums) {
    int n = nums.size();
    boolean sorted = true;
    for (int i = 1; i < n; i++) {
        if (nums.get(i) < nums.get(i - 1)) {
            sorted = false;
        }
    }
    return sorted;
}
  
}