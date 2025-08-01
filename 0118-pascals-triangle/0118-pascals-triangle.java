class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1); // first element of triangle is always one
            // to fill the rest of the row elements
            for(int j=1;j<i;j++){
                int sum=triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                row.add(sum);
            }
            if(i>0){ // ecept the first row, last element in every row is zero also
                row.add(1);
            }
            triangle.add(row);
        }

        return triangle;
        
    }
}