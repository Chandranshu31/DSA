class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i=0;
        int n=intervals.length;

        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        // now deal with overlappin intervals

        while(i<n && intervals[i][0]<=newInterval[1]){ // if an interval is starting before end of newInterval then its overlapping
         newInterval[0]=Math.min(intervals[i][0],newInterval[0]); // create new begining of interval, it would be min of curr and new 

         newInterval[1]=Math.max(intervals[i][1],newInterval[1]);  // and ending would be as max as possible of both's end time 
         i++;
        }
        res.add(newInterval);

        while(i<n ){
            res.add(intervals[i]); i++;
        }

        return res.toArray(new int[res.size()][]);
        
    }
}