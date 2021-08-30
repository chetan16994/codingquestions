package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L1338 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) map.put(i, map.getOrDefault(i, 0)+1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b- a);
        for (int i: map.values()) pq.offer(i);

        int count = 0;
        int length = arr.length;
        while(!pq.isEmpty()){
            length -= pq.poll();
            if (length <= arr.length / 2) return count + 1;
            else count++;
        }
        return count;
    }
    public static void main(String[] args) {
        L1338 obj=new L1338();
        System.out.println(obj.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
}
