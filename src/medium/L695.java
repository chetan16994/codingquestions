package medium;

public class L695 {
    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1) {
                    maxCount=Math.max(maxCount,dfs(grid, i, j));
                }
            }
        }
        return maxCount;
    }
    public int dfs(int[][] grid, int i, int j){
        if (i<0 || j<0 || i>= grid.length || j>= grid[i].length || grid[i][j]!=1 )
            return 0;

        grid[i][j]=0;

        int area=1;

        for (int[] dir: dirs)
            area+=dfs(grid,i+dir[0], j+dir[1]);

        return area;
    }
    public static void main(String[] args) {
        L695 obj=new L695();
        System.out.println(obj.maxAreaOfIsland(
                new int[][]{
                        {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}
                }
        ));
    }
}
