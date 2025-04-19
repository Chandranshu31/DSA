    class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
        long count=0;
        // if we sort the array then we can handle the ranged quite effectively , as we r not supposed to return original 
        // indices and only the count so it would not be any serious matter of case if we sort  the array

        // now for every nums[i] we need to find nums[j] such that j>i and lower<=nums[i]+nums[j]<=upper

        for(int i=0;i<n;i++){
            int lowerLimit= lower-nums[i];
            int upperLimit= upper-nums[i];  

 // if nums[i] is fixed then the minimum value to satisfy the condition lower<=nums[i]+nums[j] would be lowerLimit
 // lowerLimit is like the min value of a numb we need to enter in that ZONE. the numbers which r less than that won't
 // take us into that LIMIT ZONE.
 // and same for upper to stay in that zone
             int right=upperBound(nums,i+1,n-1,upperLimit);
             int left=lowerBound(nums,i+1,n-1,lowerLimit);
             count+=(right-left);  // all the numbers between the limtwill help nums[i]+x to fall in range hwere x are numbs between right and left
        }
        return count;

    }

    public int upperBound(int nums[],int start,int end, int target){
        // func to find the first index that is  greater than TARGET(upperLimit);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){ 
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }

        public int lowerBound(int nums[],int start,int end, int target){
        // func to find the first index that is smaller than TARGET(upperLimit);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){ 
              end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }


}


/**
BRUTE FORCE WOULD BE THIS
 class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        int count=0;
    
        
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n){
                if ( (( nums[i]+nums[j]  )>=lower) && ((nums[i]+nums[j])<=upper)  ){

                    count++;
                }
                j++;
            }
        }
        return count;


        
        
    }
}*/


        
