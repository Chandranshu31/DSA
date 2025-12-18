class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { 
        int n = nums.length;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {

                int count = 0;
                int j = i;

                while (j < n && nums[j] ==1) {
                    j++;
                    count++;
                }
                maxCount = Math.max(count, maxCount);
                i=j-1; // so that we can make point i to where the consecutive 1s loop ended so wedont check
                // those 1 s which were involved in previous steak again
                // i=1 hgya hen loop end i++,fir i=2 se start hoga for loop naaki 1 se
            }

        }
        return maxCount;

    }
}

/**
anothrer aproach cold be
int mc=0;
int c=0;
for(int i=0;i<nums.lengthli++){
    if(nums[i]==1){
        c++;
        mc=math.max(mc,c);
    }
    else{
        c=0; // on getting a zero make the count of consecutive ones 0
    }
} */
