class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid.length;
        int m= grid[0].length;
        //Arrays.sort(grid,Comparator.comparingInt(a->a[1]));

        int count=0;
       for(int col=0;col<m;col++ ){
        for(int row=1;row<n;row++){
            if(grid[row][col]>grid[row-1][col]){
                // already greater so leave it
                continue;
            }
            else{
                int inc=(grid[row-1][col]+1)-grid[row][col];
                count+=inc;
                grid[row][col]+=inc;
            }
        }

       }
       return count;
        

        
    }
}