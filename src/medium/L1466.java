package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class L1466 {

    public int minReorder(int n, int[][] connections) {
        ArrayList<Integer> [] graph=new ArrayList[n];
        ArrayList<Integer> [] graphUndirected=new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graphUndirected[i]=new ArrayList<>();
            graph[i]=new ArrayList<>();
        }

        for (int i = 0; i < connections.length; i++) {
            graph[connections[i][0]].add(connections[i][1]);

            graphUndirected[connections[i][0]].add(connections[i][1]);
            graphUndirected[connections[i][1]].add(connections[i][0]);
        }

        boolean[] visited= new boolean[n];

        return  dfs(0,visited,graph,graphUndirected);
    }
    public int dfs(int curr,  boolean[] visited, ArrayList<Integer>[] graph,ArrayList<Integer>[] graphUndirected){
        int counter=0;
        visited[curr]=true;
        for (int i = 0; i < graphUndirected[curr].size(); i++) {
            // int child=graphUndirected[curr].get(i);
            if (!visited[graphUndirected[curr].get(i)]){
                if (!graph[graphUndirected[curr].get(i)].contains(curr))
                    counter++;
                counter+= dfs(graphUndirected[curr].get(i), visited,graph,graphUndirected);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        L1466 obj=new L1466();
        System.out.println(obj.minReorder(6, new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}}));
    }
}
