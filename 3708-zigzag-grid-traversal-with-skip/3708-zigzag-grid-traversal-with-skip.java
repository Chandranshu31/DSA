class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        ArrayList<Integer> res = new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean isRightToLeft=true;

        for(int i=0;i<m;i++){
            if(isRightToLeft){
                for(int j=0;j<n;j+=2){
                    res.add(grid[i][j]);
                }
            }else{
            // for even cols start from n-1 when right to left and for odd numb of cols start from n-2 in right to left
            int start=-1;
            if(n%2==0){
                start=n-1;
            }else{
                start=n-2;
            }
            for(int j=start;j>=0;j-=2){
                res.add(grid[i][j]);
            }
            }
            isRightToLeft=!isRightToLeft;
        }
       return res; 
        
    }

    
}