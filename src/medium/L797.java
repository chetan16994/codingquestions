package medium;

import java.util.*;

public class L797 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new LinkedList<>();
        int n=graph.length;
        allPathsSourceTarget(0,graph,new LinkedList(),res, graph.length-1);
        return res;
    }
    public void allPathsSourceTarget(int vertex,int[][] graph, List<Integer> cur, List<List<Integer>> res, int target){
        cur.add(vertex);
        if (vertex==target)
            res.add(new ArrayList<>(cur));
        else {
            for (int child:graph[vertex])
                allPathsSourceTarget(child,graph, cur, res,target);
        }
        cur.remove(cur.size()-1);
    }
    public static void main(String[] args) {
        L797 obj=new L797();
        obj.allPathsSourceTarget(new int[][]{{4,3,1},{3,2,4},{3},{4},{}});
    }
}
