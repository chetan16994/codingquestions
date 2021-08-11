package medium;

public class L547 {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int provinces=0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
    public void dfs(int row,int[][] mat,boolean[] visited){
        if (!visited[row])
            visited[row]=true;
        for (int i = 0; i < mat.length; i++) {
            if (mat[row][i]==1 && !visited[i])
                dfs(i,mat,visited);
        }
    }
    public static void main(String[] args) {
        L547 obj=new L547();
        int[][] edges=new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        System.out.println(obj.findCircleNum(edges));
    }
}
