class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int matrix[][]=new int[difficulty.length][2];
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=difficulty[i];
            matrix[i][1]=profit[i];
        }

        Arrays.sort(matrix,Comparator.comparingInt(o -> o[0]));
        Arrays.sort(worker);
        int maxProfit=0;
        for(int i=0;i<worker.length;i++){
            int currCapacity=worker[i];
            int best=0;
            for(int j=0;j<matrix.length&& matrix[j][0]<=currCapacity;j++){
                best=Math.max(best,matrix[j][1]);
            }
            maxProfit+=best;
        }
        
        return maxProfit;
    }
}

// sort the matrix on basis of difficulty and workers also, so that we can match the less capacity with less difficulty
// and avoid further traversal and till we dont reach the capacity of worker threshold in matrix difficulty
// column keeep tracking the best profit the worker can make in htat range as one job can be done multiple times.