package medium;

import java.util.ArrayList;
import java.util.List;

public class L1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res=new ArrayList<>();
        boolean[] indegree=new boolean[n];
        for (List<Integer> edge: edges){
            indegree[edge.get(1)]=true;
        }
        for (int i=0;i<n;i++){
            if (!indegree[i])
                res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        L1557 obj=new L1557();
        List<List<Integer>> edges=List.of(
                List.of(0, 1),
                List.of(0, 2),
                List.of(2, 5),
                List.of(3, 4),
                List.of(4, 2)
        );
        System.out.println(obj.findSmallestSetOfVertices(6,edges));
    }
}
