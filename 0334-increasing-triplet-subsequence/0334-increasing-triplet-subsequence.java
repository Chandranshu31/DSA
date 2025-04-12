class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int n = nums.length;
        // the idea is to get the third greater element after first and second if we could not then ret false
        for (int i = 0; i < n; i++) {
            if (nums[i] <= firstSmallest) {
                firstSmallest = nums[i];
            } else if (nums[i] <= secondSmallest) {
                secondSmallest = nums[i];
            } else {
                return true; // if a numb is not less than first smallest and seocnd smallest tehn it means its bigger than both of them and hence we got our triplet
            }
        }
        return false;

    }
}

/**
These 2 approaches I used when I did not know that it is not necessary to have contagious sequence and 2nd one is correct till
an extent but too much greedy so fails on few test cases
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int k=3;  // the size of our window
        int n=nums.length;
        if(n<k){
            return false;
        }
         boolean isIncTrip=false;
        for(int i=0;i<=n-k;i++){
            int p=i;
            int j=i+k-1;
            boolean isInc=true;
            while(j>i){
                if(nums[j-1]>=nums[j]){
                    isInc=false;
                }
                j--;
            }
            if(isInc){
                isIncTrip=true;
                break;
            }

        }
        return isIncTrip;
        
    }
}

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int k = 3;
        if (n < k) {
            return false;
        }

        boolean isIncTrip = false;
        for (int i = 0; i <= n - k; i++) {
            int curr = nums[i];
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (count == 0 && nums[j] > curr) {
                    count++;  // We found the first larger number
                    curr = nums[j];  // Update curr to this number
                } else if (count == 1 && nums[j] > curr) {
                    count++;  // We found the second larger number
                    break;  // Exit the loop since we found the triplet
                }
            }
            if (count == 2) {
                isIncTrip = true;
                break;  // Found the triplet, break the outer loop
            }
        }
        return isIncTrip;
    }
}





 */