class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime=Integer.MAX_VALUE;
        for(int task[] : tasks){
            int a=task[0];
            int b=task[1];
            int deadline=a+b;
            minTime=Math.min(minTime,deadline);
        }
        return minTime;
    }
}