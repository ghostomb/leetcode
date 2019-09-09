package problems.nine;

public class NumRookCaptures {
    public static void main(String[] args) {

    }

    public int numRookCaptures(char[][] board) {
        int rRow=0,rCol=0,count=0;
        outerFor:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='R'){
                    rRow=i;
                    rCol=j;
                    break outerFor;
                }
            }
        }

        //col
        for (int col = rCol-1; col >0 ; --col) {
            if(board[rRow][col]=='p'){
                count++;
                break;
            }else if(board[rRow][col]!='.') {
                break;
            }
        }
        for (int col=rCol+1;col<board.length;++col){
            if(board[rRow][col]=='p'){
                count++;
                break;
            }else if(board[rRow][col]!='.') {
                break;
            }
        }

        //row
        for (int row = rRow-1; row >0 ; --row) {
            if(board[row][rCol]=='p'){
                count++;
                break;
            }else if(board[row][rCol]!='.') {
                break;
            }
        }
        for (int row=rRow+1;row<board.length;++row){
            if(board[row][rCol]=='p'){
                count++;
                break;
            }else if(board[row][rCol]!='.') {
                break;
            }
        }
        return count;
    }
}
