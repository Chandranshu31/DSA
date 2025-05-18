class Solution{
    public long minSum(int[] nums1,int[] nums2){
        long sum1=0,sum2=0;
        int count1=0,count2=0;
        for(int num:nums1){
            if(num==0){ 
                count1++;
            }
            sum1+=num;
        }
        for(int num:nums2){
            if(num==0){
                count2++;
            }
            sum2+=num;
        }
         // now sum1 has the sum of curr elements of num1 and sum2 holds the curr sum of elements of nums2
        // and count1 has numb of zeros in nums1, and count2 has the numb of zeros in nums2
        long minSum1=sum1+count1; // what min value we can reach from nums1
        long minSum2=sum2+count2;  // same from nums2
        if((minSum1<minSum2&&count1==0)||(minSum2<minSum1&&count2==0)){
            return -1;
        }
        return Math.max(minSum1,minSum2);
    }
}
