class Solution {
    public int countDays(int days, int[][] meetings) {
        int n= meetings.length;
        int m= meetings[0].length;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])); // sort on the basis of starting day of meeting

        List<int[]> merged = new ArrayList<>();
        int current[]= meetings[0];

        for(int i=1;i<n;i++){
            if(meetings[i][0]<=current[1]){
                current[1]= Math.max(current[1], meetings[i][1]);
            }
            else{
                merged.add(current);
                current=meetings[i];
            }
        }
        merged.add(current);

       int totalMeetingDays = 0;
       for(int [] present:merged){
        totalMeetingDays+= present[1]-present[0]+1;
       }

       return days-totalMeetingDays;
        
    }
}