package medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class L451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        PriorityQueue<Character> pq=new PriorityQueue<>(
                (a,b)->{ return map.get(b) -map.get(a);}
        );
        pq.addAll(map.keySet());
        StringBuilder res= new StringBuilder();
        while (!pq.isEmpty()){
            char c=pq.poll();
            for (int i = 0; i < map.get(c); i++) {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        L451 obj=new L451();
        System.out.println(obj.frequencySort("tree"));
    }
}
