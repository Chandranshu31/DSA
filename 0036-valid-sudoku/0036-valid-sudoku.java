class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.'){
                continue;
            }
            else{
                char current = board[i][j];
                // check the column
                for(int k=0;k<9;k++){
                    if( k!=i&&board[k][j]==current){
                        return false;
                    }
                }
                // check the rows
                for(int p=0;p<9;p++){
                    if(p!=j&&board[i][p]==current){
                        return false;
                    }
                }

                // check the grid
                int sr=(i/3)*3;
                 
                int sc=(j/3)*3;


                for(int l=sr;l<sr+3;l++){
                    for(int q=sc;q<sc+3;q++){
                        if((l!=i||q!=j)&&board[l][q]==current){
                            return false;
                        }
                    }
                }
            }
        }
       }
       return true;
    }
}