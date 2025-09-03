class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    // the area covered by both rectnagles would be... area coverred by first+ area covered by second-overlapped area
    // overlapped area could be zero, or non zero
    int area1=(ax2-ax1)*(ay2-ay1); // area covered by first rectangle
    int area2=(bx2-bx1)*(by2-by1); // area covered by second rectangle

    // now if there is an overlapped rectangle... then its bottom left co-ordinates and top right co-ordinates r
    int bottomX=Math.max(ax1,bx1);
    int bottomY=Math.max(ay1,by1);

    int topX=Math.min(ax2,bx2);
    int topY=Math.min(ay2,by2);

    // now widhth and height of overlapped rectangle 

    int width=topX-bottomX;
    int height=topY-bottomY;

    // now if width  and height r less than zero then there is no overlapping or else  there is
    int overlappedArea=0;
    if(width>0 && height>0){
        overlappedArea=width*height;
    }
    return area1+area2-overlappedArea;
    }
}