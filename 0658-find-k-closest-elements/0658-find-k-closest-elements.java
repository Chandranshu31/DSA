class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(right-left>=k){
            if(Math.abs(arr[left]-x)>Math.abs(arr[right]-x)){
                left++;
            }else{
                right--;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            res.add(arr[i]);
        }

        return res;
        

        
    }
}

//set the pointers at the two ends and keep shrinking the window until teher are only K elements in the window.
// move the left pointer if abs diff between el at left is greater than abs diff with el at right 
// so that we can get an element which is a bit closer to the X, as the array is sorted
// and at the end just all the elements present in the window