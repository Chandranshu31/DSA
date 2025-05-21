class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n = matrix[0].length;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row.contains(i)|| col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}

/*
class Solution {
public void setZeroes(int[][] matrix) {
int m= matrix.length;
int n= matrix[0].length;

int copy[][]= new int[m][n];

for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
copy[i][j]= matrix[i][j];
}
}

for(int i=0;i<m ;i++){
for(int j=0;j<n;j++){
if(matrix[i][j]==0){
for(int l=0;l<m;l++){
copy[l][j]=0; // make that whole row zero, with getting column index from original matrix
}
for(int k=0;k<n;k++){
copy[i][k]=0; // make the whole column zero.
}
}
}
}

for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
matrix[i][j]=copy[i][j];
}
}

}
}*/
 