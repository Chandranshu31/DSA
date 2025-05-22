class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int matrix[][]= new int[profit.length][2];
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=difficulty[i];
            matrix[i][1]=profit[i];
        } 
        int maxProfit=0;
        Arrays.sort(matrix,Comparator.comparingDouble(o -> o[0]));
        for(int i=0;i<worker.length;i++){
            int currCapacity=worker[i];
            int best = 0;
            for (int j = 0; j < matrix.length && matrix[j][0] <= currCapacity; j++) {
                best = Math.max(best, matrix[j][1]);
            }
            maxProfit += best;
        }
        return maxProfit;

    }
}