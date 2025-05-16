class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> res = new ArrayList<>();
        int n=mountain.length;
        for(int i=1;i<=n-2;i++){
            if(mountain[i]>mountain[i-1]&& mountain[i]>mountain[i+1]){
                res.add(i);
            }
        }
        return res;
        
    }
}