package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L207Improvised {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if(prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) return true;

        ArrayList<Integer>[] graph=new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i]=new ArrayList();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        int[] visited=new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i,visited,graph))
                return false;
        }
        return true;
    }

    public boolean dfs(int curr,int[] visited, ArrayList<Integer>[] graph){
        if (visited[curr]==2)
            return true;

        if (visited[curr]==1)
            return false;

        visited[curr]=1;
        for (int neighbour: graph[curr]){
            if (!dfs(neighbour,visited,graph))
                return false;
        }
        visited[curr]=2;
        return true;
    }

    public static void main(String[] args) {
        L207Improvised obj=new L207Improvised();
        System.out.println(obj.canFinish(2,new int[][]{{0,1},{1,0}}));

    }
}
