class Solution {
    public int minimumArea(int[][] grid) {
        int top=-1,bottom=-1,left=-1,right=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                 if (top == -1) {  // first 1 found, then initialise all the pointers 
                        top = bottom = i;
                        left = right = j;
                    } else {   // if we dont do the above then when first 1 found then top=math.minn(-1,i) which is wrong
                        top = Math.min(top, i);
                        bottom = Math.max(bottom, i);
                        left = Math.min(left, j);
                        right = Math.max(right, j);
                    }
               }
            }
        }
        return (bottom-top+1)*(right-left+1);
    }
}

/**
top → the smallest row index containing a 1

bottom → the largest row index containing a 1

left → the smallest column index containing a 1

right → the largest column index containing a 1
so bottom-top+1 would give us the height and right-left+1 would give us the length */