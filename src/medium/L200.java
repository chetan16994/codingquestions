package medium;

public class L200 {
    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};

    public int numIslands(char[][] grid) {

        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, char[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1')
            return;

        grid[i][j]='0';
        for(int[] dir : dirs){
            dfs(i+dir[0],j+dir[1], grid);
        }
    }
    public static void main(String[] args) {
        L200 obj=new L200();
        System.out.println(obj.numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }));
    }
}
