class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);  // nums[1] to arr1, 1 based indexing
        arr2.add(nums[1]);  // nums[2] to arr2, 1 based indexing;

        for(int i=2;i<n;i++){
            int k=nums[i];
            int p=arr1.get(arr1.size()-1);  // last element of arr1
            int q =arr2.get(arr2.size()-1); // last element of arr2
            if(p>q){
                arr1.add(k);
            }else{
                arr2.add(k);
            }
        }

        int res[]=new int[n];
        int k=0; /// to track indx of res arr,,  
        for(int i=0;i<arr1.size();i++){  // no index bound becasue always arr1size<=nums
            res[k++]=arr1.get(i);
            
        }
         for(int i=0;i<arr2.size();i++){
            res[k++]=arr2.get(i);
         }

        return res;
    }
}