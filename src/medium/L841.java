package medium;

import java.util.*;

public class L841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        canVisitAllRooms(0,visited,rooms);
        for (boolean res:visited){
            if (!res) return false;
        }
        return true;
    }
    public void canVisitAllRooms(int door,boolean[] visited, List<List<Integer>> rooms){
        if (!visited[door]){
            visited[door]=true;
            for (int key: rooms.get(door) )
                canVisitAllRooms(key,visited,rooms);
        }
    }
    public static void main(String[] args) {
        L841 obj=new L841();
        List<List<Integer>> edges=List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );
        System.out.println(obj.canVisitAllRooms(edges));
    }
}
