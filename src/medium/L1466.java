package medium;

import java.util.ArrayList;
import java.util.Set;

public class L1466 {
    public int minReorder(int n, int[][] connections) {
        ArrayList<Integer> [] graph=new ArrayList[n];
        ArrayList<Integer> [] graphUndirected=new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graphUndirected[i]=new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            graph[i]=new ArrayList<>();
        }

        for (int i = 0; i < connections.length; i++) {
            graph[connections[i][0]].add(connections[i][1]);

            graphUndirected[connections[i][0]].add(connections[i][1]);
            graphUndirected[connections[i][1]].add(connections[i][0]);
        }
        System.out.println(" directed");
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i+" : ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print(graph[i].get(j)+" ");
            }
            System.out.println();
        }

        System.out.println("un directed");
        for (int i = 0; i < graphUndirected.length; i++) {
            System.out.print(i+" : ");
            for (int j = 0; j < graphUndirected[i].size(); j++) {
                System.out.print(graphUndirected[i].get(j)+" ");
            }
            System.out.println();
        }

        int counter=0;
        int[] visited= new int[n];

         dfs(0,visited,counter,graph,graphUndirected);
        System.out.println("counter : "+counter);
        return counter;
    }
    public void dfs(int curr, int[] visited,int counter, ArrayList<Integer>[] graph,ArrayList<Integer>[] graphUndirected){
        visited[curr]=1;
        for (int i = 0; i < graphUndirected[curr].size(); i++) {
            int child=graphUndirected[curr].get(i);
            if (visited[child]==0){
                if (!graph[child].contains(curr))
                    counter++;
                dfs(graphUndirected[curr].get(i), visited, counter,graph,graphUndirected);
            }
        }
    }

    public static void main(String[] args) {
        L1466 obj=new L1466();
        System.out.println(obj.minReorder(6, new int[][]{{0,1},{1,3},{2,3},{4,0},{4,5}}));
    }
}
