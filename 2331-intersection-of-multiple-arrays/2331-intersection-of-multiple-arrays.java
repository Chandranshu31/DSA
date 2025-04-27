class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){  // is it a jagged matrix so instead of nums[0].length we have nums[i].length
            int curr=nums[i][j];
            map.put(curr,map.getOrDefault(curr,0)+1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key)==nums.length){
                res.add(key);
            }
        }
         Collections.sort(res);
        return res;
        
    }
}

// the logic is get the frequency of every element present in matrix
// and if the frequency of a number is equal to numb of rows then that numb has appeared in each row, as there r only distinct numbers in a row