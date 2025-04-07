class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n= timeSeries.length;
        int totalDuration=0;

        for(int i=0;i<n-1;i++){
            int startAttack= timeSeries[i];
            int endAttack= timeSeries[i]+duration-1;
            int nextAttack = timeSeries[i+1];
            if(nextAttack>endAttack){  // is next attack  happens after the end of current attack then add whole duration of seconds 
                totalDuration+=duration;
            }
            else{
                totalDuration+=nextAttack-startAttack ;  // if next attack starts before the current ends then we just want 
                // that amnt of time to be added that is before the nextAttack to avoid duplicates
            }
        }
        // for the last attack whole duration would go in 
        // therefore
        totalDuration+=duration;
        return totalDuration;
        
    }
}