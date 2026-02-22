class Solution {
    public int binaryGap(int n) {
        if(n==0) return 0;
        String bin=toBinary(n);
        int maxDistance=Integer.MIN_VALUE;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                int currIdx=i;
                for(int j=i+1;j<bin.length();j++){
                    if(bin.charAt(j)=='1'){
                        int distance=j-i;
                        maxDistance=Math.max(maxDistance,distance);
                        break;
                    }

                }
            }
        }
        if(maxDistance==Integer.MIN_VALUE) return 0;
        return maxDistance;
        
    }
    public String toBinary(int n) {
    return Integer.toBinaryString(n);
}
}