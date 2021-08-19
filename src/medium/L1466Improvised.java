package medium;

import java.util.ArrayList;
import java.util.Map;

public class L1466Improvised {
    public int minReorder(int n, int[][] connections) {
        ArrayList<Integer>[] graph=new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i]=new ArrayList<>();
        }

        for (int i = 0; i < connections.length; i++) {
            graph[connections[i][0]].add(connections[i][1]);
            graph[connections[i][1]].add(-connections[i][0]);
        }

        boolean[] visited= new boolean[n];

        return  dfs(0,visited,graph);
    }
    public int dfs(int curr,  boolean[] visited, ArrayList<Integer>[] graph){
        int counter=0;
        visited[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
             int child=graph[curr].get(i);
            if (!visited[Math.abs(child)]){
                counter+= dfs(Math.abs(child), visited,graph) + (child>0 ? 1 : 0);
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        L1466Improvised obj=new L1466Improvised();
        System.out.println(obj.minReorder(6, new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}}));
    }
}
