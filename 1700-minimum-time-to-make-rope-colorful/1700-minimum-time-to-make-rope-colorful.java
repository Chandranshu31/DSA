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

so we set a pointer prev to track the current min among the group of adjacent same elements
 if we get a prev with smaller val then remove it by adding its cost and updating the prev
 or else just get the current one as minn*/

 /**
 
public class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalCost = 0;
        int n = colors.length();
        int i = 0;

        while (i < n - 1) { 
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                List<Integer> group = new ArrayList<>();
                group.add(neededTime[i]);

                int j = i + 1;
                while (j < n && colors.charAt(j) == colors.charAt(i)) {
                    group.add(neededTime[j]);
                    j++;
                } 

                Collections.sort(group);
                for (int k = 0; k < group.size() - 1; k++) {
                    totalCost += group.get(k);
                }

                i = j; // set the pointer i to the next color
            } else {
                i++;
            }
        }

        return totalCost;
    }
}
  ANOTHER VALID SOLUTION */