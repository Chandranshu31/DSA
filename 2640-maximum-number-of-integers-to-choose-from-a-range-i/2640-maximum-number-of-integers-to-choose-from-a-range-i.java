class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: banned){
            hs.add(num);
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(hs.contains(i)){
                continue;
            }
            if (sum + i> maxSum) {
                break;
            }
            sum += i;
            count++;
        }
        return count;
    }
}