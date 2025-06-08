class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDistance = Integer.MIN_VALUE;
        int recentOneIdx = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) { // occupied
                if (recentOneIdx == -1) {  // case of leading zeros, if not updated till yet, then it would be the till now maxdistance for a closest occupied
                    maxDistance = i;
                } else {  // weve found a one and theres is also a pre one and in between there are zeros, so the best place to sit to make the closest occupiedmax is in between or centre
                    int dist = (i - recentOneIdx) / 2;
                    maxDistance = Math.max(maxDistance, dist);
                }
                recentOneIdx = i;
            }

            if (i == seats.length - 1 && seats[i] == 0) {   // for trailing zeros, get the recent one and calac distance and update the maxdistace
                int distance = seats.length - 1 - recentOneIdx;
                maxDistance = Math.max(maxDistance, distance);
            }
        }

        return maxDistance;
    }
}

/**
A burte force approach would be
class Solution {
    public int maxDistToClosest(int[] seats) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<seats.length;i++){
           if(seats[i]==1){
            set.add(i);
           }
       } 
       int maxDistance=Integer.MIN_VALUE;
       for(int i=0;i<seats.length;i++){
        if(seats[i]==0){
            int currIdx=i;
            int closestOccupiedIdx=Integer.MAX_VALUE;
            for( int k: set){
                int diff=Math.abs(currIdx-k);
                closestOccupiedIdx=Math.min(closestOccupiedIdx,diff);
            }
           maxDistance=Math.max(maxDistance,closestOccupiedIdx);
        }
       }
       return maxDistance;
    }
} */
