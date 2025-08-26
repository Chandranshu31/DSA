class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=Integer.MIN_VALUE;
        double maxDiagonalLength=Double.MIN_VALUE;
        for(int i=0;i<dimensions.length;i++){
           int v= (dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]);
           // double diagonalLength=Math.sqrt((double)v);  // no need to compute sqrt always as if 98>56 then obv, srtof 98>sqrt of 56
            if(v>maxDiagonalLength){
                maxDiagonalLength=v;
                maxArea=dimensions[i][0]*dimensions[i][1]; 
            }else if (v == maxDiagonalLength) {
                maxArea = Math.max(maxArea, dimensions[i][0]*dimensions[i][1]);
            }

        }
        return maxArea;
        
    }
}