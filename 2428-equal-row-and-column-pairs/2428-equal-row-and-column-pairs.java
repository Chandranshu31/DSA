class Solution {
    public int equalPairs(int[][] grid) {
    HashMap<List<Integer> , Integer> rowMap = new HashMap<>();
    // enter all the rows into the map as its elements as key

    for(int i=0;i<grid.length;i++){
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<grid.length;j++){
            list.add(grid[i][j]);
        }
        rowMap.put(list,rowMap.getOrDefault(list,0)+1);
    }

    // now make a list of all the cols element and check if any such row exists in map, if yes then add the freq of rows
    int count=0;

    for(int i=0;i<grid.length;i++){
        ArrayList<Integer> list= new ArrayList<>();
        for(int j=0;j<grid.length;j++){
            list.add(grid[j][i]);
        }
        if(rowMap.containsKey(list)){
            count+=rowMap.get(list);
        }
    }
    return count;
        
    }
}