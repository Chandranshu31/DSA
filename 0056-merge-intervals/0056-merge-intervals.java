class Solution {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;
        int m= intervals[0].length;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // sort the intervals on the baiss of their start time
        // so that we could get to know which one is getting srted first, it would be helpful to figure out the overlapping intervals

         List<int[]> res = new ArrayList<>(); // an array list which stores an array of integer type at its indx

        int current[]= intervals[0]; // get the first interval into current to compare with intervals present ahead

        for(int i=1;i<n;i++){
            if(intervals[i][0]<=current[1]){
                // if the start time of current interval is less than or equal to end time of prev interval 
                // then it is the case of overlapping  so just merge tehm by updating the current's end time, it wpuld be max of curent's end time or intervals end time
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else{  // if not overlapping then simply add the current interval(current) into the list and make the present interval as the next current
                res.add(current);
                current= intervals[i];
            }
        } 
        

        res.add(current);  // add last interval into list
        return res.toArray(new int[res.size()][]);   // from list get a lain 2 d array having numb of rows ==  size of list that updated number of intervals 


        
    }
}