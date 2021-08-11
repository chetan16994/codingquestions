package medium;

import java.util.*;

public class L207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if(prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) return true;

        int[] indegrees=new int[numCourses];
        ArrayList[] graph=new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i]=new ArrayList();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            indegrees[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        Queue<Integer> queue=new LinkedList<Integer>();

        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i]==0)
                queue.add(i);
        }

        ArrayList res=new ArrayList();

        while (!queue.isEmpty()){
            int curr=queue.poll();
            res.add(curr);
            for (int i=0;i< graph[curr].size();i++){
                int neighbour=(int)graph[curr].get(i);
                indegrees[neighbour]--;
                if (indegrees[neighbour]==0)
                    queue.add(neighbour);
            }
        }
        return res.size() == numCourses;
    }
    public static void main(String[] args) {
        L207 obj=new L207();
        System.out.println(obj.canFinish(2,new int[][]{{0,1},{1,0}}));

    }
}
