class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        // we will store the last indinces where a particular type of garbage exists, in array of size three, 0th for M,1st for p, 2nd for G
        int indx[]=new int[3];
        indx[0]=lastIdx('M', garbage);
        indx[1]=lastIdx('P',garbage);
        indx[2]=lastIdx('G',garbage);

        int timeM = 0, timeP = 0, timeG = 0;

    if(indx[0]!=-1){   // For Metal (M)
       for (int i = 0; i <= indx[0]; i++) {
       String curr = garbage[i];
        for (int j = 0; j < curr.length(); j++) {
        if (curr.charAt(j) == 'M') {
            timeM++;
           }
         }
       if (i > 0) timeM += travel[i - 1]; // travel[i-1] is the cost to reach house i
          }
         }

      // For Paper (P)
      if(indx[1]!=-1){
          for (int i = 0; i <= indx[1]; i++) {
         String curr = garbage[i];
        for (int j = 0; j < curr.length(); j++) {
        if (curr.charAt(j) == 'P') {
            timeP++;
        }
    }
    if (i > 0) timeP += travel[i - 1];
}
    }

// For Glass (G)

if(indx[2]!=-1){
for (int i = 0; i <= indx[2]; i++) {
    String curr = garbage[i];
    for (int j = 0; j < curr.length(); j++) {
        if (curr.charAt(j) == 'G') {
            timeG++;
        }
    }
    if (i > 0) timeG += travel[i - 1];
}
}

int totalTime = timeM + timeP + timeG;
return totalTime;


        
    }
    // a helper function to get the last indx which consists of a type of garbage
    public int lastIdx(char c,String[] garbage){
        if(garbage.length==0) return 0;

        int idx=-1;
        for(int i=0;i<garbage.length;i++){
            String curr=garbage[i];
            if(curr.indexOf(c)!=-1){
                idx=i;
            }
        }
        return idx;
    }
}