package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class L210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<Integer> [] graph=new  ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i]=new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length ; i++) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        int[] visited=new int[numCourses];
        ArrayList<Integer> res=new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i,visited,graph,res))
                return new int[]{};
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);

        return result;
    }
    public boolean dfs(int curr,int[] visited, ArrayList<Integer>[] graph,ArrayList<Integer> res){
        if (visited[curr]==2)
            return true;
        if (visited[curr]==1)
            return false;
        visited[curr]=1;
        for (int neighbour:graph[curr]) {
            if (!dfs(neighbour,visited,graph,res))
                return false;
        }
        res.add(curr);
        visited[curr]=2;
        return true;
    }
    public static void main(String[] args) {
        L210 obj=new L210();
        for (int i:obj.findOrder(2,new int[][]{{1,0}}))
            System.out.println(i);
    }
}
