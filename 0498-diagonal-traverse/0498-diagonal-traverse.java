class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n=mat[0].length;
        int res[]= new int[m*n];
        int row=0,col=0,idx=0;
        while(idx<m*n){
            res[idx++]=mat[row][col];
            if((row+col)%2==0){ // if the sum is even then it means move up right
             if(col==n-1){
                row++;
             }else if(row==0){
                col++;
             }else{
                row--;
                col++;
             }

            }else{
                // move down left if sum is odd
                if(row==m-1){
                    col++;
                }else if(col==0){
                    row++;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}

// easy code to remember