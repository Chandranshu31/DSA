class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // we will first find the next greater of the nums2
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums2.length;i++){
        map.put(nums2[i],i);  // given that all elements r unique
       }

       Stack<Integer> s = new Stack<>();
       int nxtG[]=new int[nums2.length];
       nxtG[nums2.length-1]=-1;
       s.push(nums2[nums2.length-1]);

       for(int i=nums2.length-2;i>=0;i--){
            int curr=nums2[i];
            while(!s.isEmpty() && s.peek()<=curr){
                s.pop();
            }
            if(s.isEmpty()){
                nxtG[i]=-1;
            }else{
                nxtG[i]=s.peek();
            }
            s.push(nums2[i]);
       }
       int res[]= new int[nums1.length];
       // nums1 is subset of nums2, so all the elements of nums1 exists in nums2
       for(int i=0;i<nums1.length;i++){
          int curr=nums1[i];
          int idx=map.get(curr);
          int value=nxtG[idx];
          res[i]=value;
       }
       return res;
    }
}