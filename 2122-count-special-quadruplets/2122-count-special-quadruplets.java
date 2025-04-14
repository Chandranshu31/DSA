class Solution {
    public int countQuadruplets(int[] nums) {
        int n=nums.length;
        if(n<4){   // need atleast 4 elements to form a quadruplets
            return 0;
        }
        int count=0;

        for(int i=0;i<=n-4;i++){  // <= n-4 to form a valid quadruplet ahead
            for(int j=i+1;j<=n-3;j++){
                for(int k=j+1;k<=n-2;k++){
                    for(int z=k+1;z<n;z++){
                        if(nums[i] + nums[j] + nums[k] == nums[z]){
                            count++;
                        }

                    }
                }
            }
        }
        return count;
         
    }
}