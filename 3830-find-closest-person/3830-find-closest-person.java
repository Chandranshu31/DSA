class Solution {
    public int findClosest(int x, int y, int z) {
        int distA=Math.abs(x-z);
        int distB=Math.abs(y-z);
        if(distA<distB) return 1;
        else if(distB<distA) return 2;
        return 0;
    }
}