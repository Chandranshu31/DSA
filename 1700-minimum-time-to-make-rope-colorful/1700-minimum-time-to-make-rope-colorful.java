class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int minTime=0;
        int prev=0;
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(prev)){

                if(neededTime[prev]<neededTime[i]){
                    minTime+=neededTime[prev];
                    prev=i;
                }else{
                    minTime+=neededTime[i];    
                }
           }
           else{
            prev=i; // update the prev if colors does not match 
           } 
        }

        return minTime;
    }
}


// the prev code works perfectly when there are only two adjacent colors always 
/*class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int minTime=0;
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                minTime+=Math.min(neededTime[i],neededTime[i-1]);
            }
        }
        return minTime;
    }
} */
/**but when there are multiple ones it fails

so we set a pointer prev to track the current min */