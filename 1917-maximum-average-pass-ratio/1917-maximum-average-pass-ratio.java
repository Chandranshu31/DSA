class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                double gainA=gain(a[0],a[1]);
                double gainB=gain(b[0],b[1]);
                return Double.compare(gainB,gainA); // max heap by gain
            }
        );
        // a PQ which takes a array of size 2 as input(by default given size is two), where a[0] represents the pass students and a[1] represents totalt student of a class, same goes for b
        // and we are calculating the gain by the two classes and sorting them on basis of max gain

        for(int[] cls: classes){
            pq.add(cls);
        } // add all the elemts of classes intot the pq..

        while(extraStudents>0){  // for every extra student
            int highest[]=pq.remove();  // get the claass with net max gain
            highest[0]++;  // update its pass count
            highest[1]++; // update its total count.... like assigning
            pq.add(highest);  // add it to the pq 
            extraStudents--;  //reduce the count
        }

        double maxTotal=0.0;  // to get the sum of ratios of all which is a max ratiosum
        for(int[]cls: pq){
            maxTotal+=(double) cls[0]/cls[1];
        }

        return maxTotal/classes.length;  // return the maxratio for whole system
    
        
    }
     public double gain(int pass, int total){  // a helper function to return the net gain by a class if we assign a new student to it
        double old=(double)pass/total; // old ratio
        double neww =(double) (pass+1)/(total+1);  // new ratio after assigning a student 
        return neww-old;  // return the net gain
     }
}


// the idea is...at every level assign the extra student to that class which will show the maximum gain in its ratio when it is assigned a single student