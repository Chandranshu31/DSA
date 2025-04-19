class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder()); // to store the score[i(var)][k] with its row numb into the map in descending order
        for(int i=0;i<n;i++){
            int curr=score[i][k];
            map.put(curr,i);
        }
        List<List<Integer>> temp= new ArrayList<>(); // to form a new mat

        for(int num: map.values()){
            int currRow=num;  // get the row with the highest score[row][k] val and then a less and so o,basically in descending order
            List<Integer> temp2 = new ArrayList<>();
            for(int j=0;j<m;j++){
                temp2.add(score[currRow][j]); // in temp add all of them curr row elements
            }
            temp.add(temp2); // add it into final list
        }

        int res[][]=new int[n][m];  // convert list into 2d mat
        for(int z=0;z<n;z++){  // n is same for all 3 temp,score,res
            for(int l=0;l<m;l++){  // same for m
                res[z][l]=temp.get(z).get(l);
            }
        }

        return res;
        
        
    }
}