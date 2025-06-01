class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                double gainA=gain(a[0],a[1]);
                double gainB=gain(b[0],b[1]);
                return Double.compare(gainB,gainA); // max heap by gain
            }
        );

        for(int[] cls: classes){
            pq.add(cls);
        }

        while(extraStudents>0){
            int highest[]=pq.remove();
            highest[0]++;
            highest[1]++;
            pq.add(highest);
            extraStudents--;
        }

        double maxRatio=0.0;
        for(int[]cls: pq){
            maxRatio+=(double) cls[0]/cls[1];
        }

        return maxRatio/classes.length;
    
        
    }
     public double gain(int pass, int total){  // a helper function to return the net gain by a class if we assign a new student to it
        double old=(double)pass/total;
        double neww =(double) (pass+1)/(total+1);
        return neww-old;
     }
}