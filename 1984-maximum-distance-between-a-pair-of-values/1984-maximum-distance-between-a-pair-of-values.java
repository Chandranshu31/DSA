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