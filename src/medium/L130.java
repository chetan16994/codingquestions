package medium;

public class L130 {
    int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {

        if (board == null || board.length == 0)
            return;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if ((i == 0 || i == board.length-1 || j == 0 || j == board[i].length-1) && board[i][j] == 'O'){
                    dfs(board, i, j);
                }
            }
        }
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 'B')  board[i][j] = 'O';
                else if (board[i][j] == 'O')  board[i][j] = 'X';
            }
        }
    }
    private void dfs(char[][] board, int i, int j){
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'O')
            return;
        board[i][j] = 'B';
        for (int[] dir: dirs)
            dfs(board,i+dir[0],j+dir[1]);
    }
    public static void main(String[] args) {
        L130 obj=new L130();
        obj.solve(new char[][]{
                {'x','x','x','x'},
                {'x','O','O','x'},
                {'x','x','O','x'},
                {'x','O','x','x'}
        });
    }
}