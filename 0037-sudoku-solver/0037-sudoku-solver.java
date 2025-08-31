class Solution {
public static boolean isSafe(char board[][],int row,int col,char character){

    // check the row; row constant col,variable
    for(int j=0;j<9;j++){ // 9bcz given that board length is 9
        if(board[row][j]==character){
            return false; //elemnt exists int that row
        }
    }

    // check the col; col constant row variable
    for(int i=0;i<9;i++){
        if(board[i][col]==character){
            return false; //elemnt exists int that col
        }

    }

    // check the 3x3 grid

    int Sr=(row/3)*3; // to get the starting index of that particular grid
    int Sc=(col/3)*3;

    for(int i=Sr;i<Sr+3;i++){
        for(int j=Sc;j<Sc+3;j++){
            if(board[i][j]==character){
                return false; // element exists in that grid
            }
        }
    }

    // otherwise elemnt DNE so safe to place there
    return true; 


}
public static boolean sudokuSolver(char board[][],int row,int col){
    // base case,
    if(row==9){
        // we traversed all the cell and got the solution
        return true;
    }

    int nextRow=row;
    int nextCol=col+1;
    if(nextCol==9){
        // we have reached the end of the col of a particular row 
        // and now its time to go to next row and first col of that row
        nextRow=row+1;
        nextCol=0;
    }

    // skip if cell is already filled
    if(board[row][col]!='.'){
        return sudokuSolver(board,nextRow,nextCol);
    }

    // place the digits

    for(char digit='1';digit<='9';digit++){
        if(isSafe(board,row,col,digit)){
            board[row][col]=digit;
            if(sudokuSolver(board,nextRow,nextCol)){
                return true;
            }
           else{ board[row][col]='.';
           }
        }

       
    }
    return false;
}    
public void solveSudoku(char[][] board) {
     sudokuSolver(board,0,0);
        
    }
}