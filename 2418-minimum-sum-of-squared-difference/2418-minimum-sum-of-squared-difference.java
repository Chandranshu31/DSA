class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int diff[]= new int[nums1.length];
        int ops=k1+k2;
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            maxDiff=Math.max(diff[i],maxDiff);
        }

        // now make a frequency array that how many elements have  a particular diff
        long count[]=new long[maxDiff+1];
        for(int d: diff){ 
            count[d]++;
        }

        // now greedily select the oe with maxDiff and reduce it by ops times or number of 
        for(int d=maxDiff;d>0 && ops>0;d--){
            if(count[d]==0) continue;
            long use=Math.min(count[d],(long) ops);
            count[d]-=use;
            count[d-1]+=use;
            ops-=use;
        }
        long ans = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (count[d] > 0) {
                ans += (long) d * d * count[d];
            }
        }
        return ans;
    }
}