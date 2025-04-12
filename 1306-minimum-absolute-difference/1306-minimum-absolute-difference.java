class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n= arr.length;
        int minAbsDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
          int diff= Math.abs(arr[i]-arr[i-1]);
          minAbsDiff=Math.min(minAbsDiff,diff);
        }
        List<List<Integer>> res= new ArrayList<>();
        for(int i=1;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i-1])==minAbsDiff){
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                res.add(temp);
            }
            }   
        return res;
    } 
}
// sort the arrays to make sure that min abs diff exists between adjacent elements only 
// again iterate over the array and check for adjacent elements and if their abs diff==inabsdiff then add them into temp list and then add it into res main list

/** BRUTE FORCE APPROACH ,TLE FOR HUGE TEST CASES BUT RUNS ON SMALL TEST CASES
 class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n= arr.length;
        int minAbsDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                minAbsDiff=Math.min(minAbsDiff,diff);
            }
        }
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<n;i++){
  
            for(int j=i+1;j<n;j++){
            List<Integer> temp = new ArrayList<>();
            
                if(Math.abs(arr[j]-arr[i])==minAbsDiff){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    res.add(temp);
                }
            }
    
        }
        return res;
    } 
}*/