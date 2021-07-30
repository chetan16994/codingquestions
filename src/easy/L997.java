package easy;

import java.util.*;

public class L997 {

    public int findJudge(int n, int[][] edges) {
        if (n==1)
            return 1;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> vertexes=new HashSet<>();

        for (int[] i: edges){
            graph.putIfAbsent(i[0], new LinkedList<>());
//                graph.putIfAbsent(i[1], new LinkedList<>());

            graph.get(i[0]).add(i[1]);
//                graph.get(edge.get(1)).add(edge.get(0));

            vertexes.add(i[0]);
            vertexes.add(i[1]);
        }

        Collection<List<Integer>> li=graph.values();
        List list = new ArrayList(li);

        for (int i: vertexes){
            if ((!graph.containsKey(i) ) && list.size()== vertexes.size()-1 && checkList(i,list))
                return i;
        }
        return -1;
    }
    public Boolean checkList(int check,List lists){
        for (Object list : lists){
            LinkedList li=(LinkedList)list;
            if(!li.contains(check))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        L997 obj=new L997();
        System.out.println(obj.findJudge(4,new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }
}
