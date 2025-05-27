class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int matrix[][]=new int[costs.length][3];
        for(int i=0;i<costs.length;i++){
            matrix[i][0]=costs[i][0];
            matrix[i][1]=costs[i][1];
            matrix[i][2]=costs[i][0]-costs[i][1];  // store the diff of A to B
        }

        int m=costs.length;
        int n=m/2;
        Arrays.sort(matrix, Comparator.comparingDouble(o -> o[2]));  // sort on the basis of diff and send first n peps to A then rest to B
        int minCost=0;
        for(int i=0;i<n;i++){
            minCost+=matrix[i][0];
        }
        for(int i=n;i<m;i++){
            minCost+=matrix[i][1];
        }

        return minCost;
    }
}