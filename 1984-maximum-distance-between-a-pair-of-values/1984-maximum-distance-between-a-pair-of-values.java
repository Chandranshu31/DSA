class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m= nums2.length;
        int maxDistance=0;
        int i=0;
        while(i<n){
            int firstGreater=firstGreaterOccurence(nums2,i,m-1,nums1[i]);
            if(firstGreater!=-1){
            int distance=firstGreater-i;
            maxDistance=Math.max(maxDistance,distance);
            }
            i++;
        }
        return maxDistance;
        
        
    }
    public int firstGreaterOccurence(int arr[],int start,int end,int x){
        int res=-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
              res=mid;
              start=mid+1;
            }else{
                end=mid-1;
            }
          }
          return res;
          

    }
}
// we need to find the first occutrence where the elemnt ifs greater than and equal tot he curr eleemnt of nums1 to be considered as a valid pair
/**
so the  brute force would have been for a single index of nums1 we will consider every j<=i in nums2 and start checkinng the other condition
but we need to find the max distance so we just need to find the greatest j for a single i where nums1[i]<=nums2[j], so we can simply apply binary search
over the nums2 and figure it out and if there is no such number then  no need to consider the calculation for it */