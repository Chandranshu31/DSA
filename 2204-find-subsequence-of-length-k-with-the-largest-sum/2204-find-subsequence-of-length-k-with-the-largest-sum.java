class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]==b[0]? b[1]-a[1] : a[0]-b[0]);
    // in pq we store the value of eleemnt and its index, to preserve the relative order that we need at the end

    for(int i=0;i<nums.length;i++){
        pq.add(new int[]{nums[i],i});
        if(pq.size()>k) pq.remove(); // to only keep top k elements into the pq
    }
       // make new array for chosen(pq) elements
        int[][] chosen = new int[k][2];
        for (int i = 0; i < k; i++) {
            chosen[i] = pq.poll(); // each element is [value, index]
        }

        // Sort chosen by original index to maintain order
        Arrays.sort(chosen, (a, b) -> a[1] - b[1]);
        int res[]=new int[k];
        for(int i=0;i<chosen.length;i++){
            res[i]=chosen[i][0];
        }
        return res;
    }
}