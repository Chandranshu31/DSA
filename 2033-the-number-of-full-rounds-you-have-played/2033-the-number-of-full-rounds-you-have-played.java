class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int start = toMinutes(loginTime);
        int end = toMinutes(logoutTime);

        // if logout happens next day then add minutes of 1 fulll day
        /** t: loginTime = "21:30", logoutTime = "03:00" if in minutes then 1290 login and 180 logout so logout happened next day therefore add a 24hrs to the end in minutes */
        if (end < start) end += 24 * 60;   

        // adjust to nearest 15
        int startAdj = (int) (Math.ceil(start / 15.0) * 15);  // ceil 
        int endAdj = (end / 15) * 15;                        // floor

        int rounds = (endAdj - startAdj) / 15; // logoutmin -login /15 
        return Math.max(0, rounds); // ensure non-negative
     
    }

    private int toMinutes(String time) {
       String parts[]=time.split(":");
       int h=Integer.parseInt(parts[0]);
       int m=Integer.parseInt(parts[1]);
       return h*60+m;
    }
}
