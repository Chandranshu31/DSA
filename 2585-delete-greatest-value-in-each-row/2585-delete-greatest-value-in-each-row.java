class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length; 

        // Sort each row
        for (int i = 0; i < rows; i++) {
            Arrays.sort(grid[i]);
        }

        int sum = 0;
        for(int j=0;j<cols;j++){
            int maxInCol=0;
            for(int i=0;i<rows;i++){
                maxInCol=Math.max(maxInCol,grid[i][j]);
            }
            sum+=maxInCol;
        }
        return sum;

    
    
    }
}
