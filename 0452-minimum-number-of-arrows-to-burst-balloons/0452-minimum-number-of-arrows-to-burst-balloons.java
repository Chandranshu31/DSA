class Solution {
    public int findMinArrowShots(int[][] points) {
      int n=points.length;
       Arrays.sort(points, Comparator.comparingDouble(o -> o[1]));
         int arrow=1;
         int currEnd=points[0][1];
         
         for(int i=1;i<n;i++){
            if(points[i][0]>currEnd){
                arrow++;
                currEnd=points[i][1];
            }
         }
         return arrow;

        
    }
}

// sort the array on the basis of end time so that we can group as much as ballons possible
// set the currend as end of first ballon and if the start of next baloon is<=currend do nothing they will get burst 
// by the same arrow
// and the moment we get a start > currEnd, we need a new arrow now and update the currEnd and start repeating the process
// again