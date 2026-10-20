class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!checkrow(board,i) || !checkcol(board,i))return false;
            for(int j=0;j<9;j++){
                if(!checkbox(board,i,j))return false;
            }
        }
        return true;
    }
    public boolean checkrow(char[][] board ,int row){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[row][i]=='.')continue;
            else if(set.contains(board[row][i]))return false;
            else set.add(board[row][i]);
        }
        return true;
    }
    public boolean checkcol(char[][] board ,int col){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[i][col]=='.')continue;
            else if(set.contains(board[i][col]))return false;
            else set.add(board[i][col]);
        }
        return true;
    }
    public boolean checkbox(char[][] board,int row,int col){
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        HashSet<Character> set=new HashSet<>();
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j]=='.')continue;
                else if(set.contains(board[i][j]))return false;
                else set.add(board[i][j]);
            }
        }
        return true;
    }
}
