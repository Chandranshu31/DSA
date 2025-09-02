class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3]; 

        int xx1=rec2[0],yy1=rec2[1],xx2=rec2[2], yy2=rec2[3];

       if(x2<=xx1 || xx2<=x1 || y2<=yy1 || yy2<=y1){
        return false;
       }
       return true;
    }
}