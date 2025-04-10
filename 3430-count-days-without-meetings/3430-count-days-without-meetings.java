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

        // gett mergred intervals from the meeting days so that we can know exactly how many days he/she was in meeting

       int totalMeetingDays = 0;   // now a single indx of list stores the diff non overlapping meeting duration so just on every interval
       // count the total numb of meeting days by end date- startdate +1
       for(int [] present:merged){
        totalMeetingDays+= present[1]-present[0]+1;
       }

       return days-totalMeetingDays;   // return the numb of days he didnt attend any meeting
        
    }
}

/**
    HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<merged.size();i++){
            int present[]= merged.get(i);
            for(int k=present[0];k<=present[1];k++){
                hs.add(k);
            }
        }

        return days-hs.size();
        
        we can also do this instead of totalmeetingdays calculations 
        but in huge cases it wuld give MEMORY LIMIT EXCEEDED */