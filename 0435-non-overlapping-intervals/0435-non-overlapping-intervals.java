class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // logic is same as activity selection 
        // only diff is here we need to find the count of those intervals which are overlapping
        // so we calculate number of non overlapping interval as we always do 
        // and length-non overlapping will give us overlapping intervals

        
        Arrays.sort(intervals,Comparator.comparingDouble(o ->o[1]));
        int nonOverLapping=0;
        nonOverLapping=1; // select the first one always
        int lastEnd=intervals[0][1];
        
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastEnd){
                nonOverLapping++;
                lastEnd=intervals[i][1];
            }
            
        }
        return intervals.length-nonOverLapping;
        
    }
}