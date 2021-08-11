package medium;

import java.util.*;

public class L684 {
    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] edge: edges){
            map.computeIfAbsent(edge[0], (i) -> {
                Set<Integer> set = new HashSet<Integer>();
                set.add(i);
                return set;
            });

            map.computeIfAbsent(edge[1], (i) -> {
                Set<Integer> set = new HashSet<Integer>();
                set.add(i);
                return set;
            });

            System.out.println(map);
            Set<Integer> first = map.get(edge[0]);
            Set<Integer> second = map.get(edge[1]);

            if(first == second) return edge;

            for(int j: second){
                first.add(j);
                map.put(j, first);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        L684 obj=new L684();
        for (int i:obj.findRedundantConnection(new int[][] {{1,2},{2,3},{3,4},{1,4},{1,5}}))
            System.out.println(i);

    }
}
