class Solution {
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int smallest=1;
        while(true){
            if(!set.contains(smallest)){
                return smallest;
            }
            smallest+=1;
        }
        
    }
}
