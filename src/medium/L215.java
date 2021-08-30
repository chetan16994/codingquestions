package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class L215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());

        for (int i:nums)
            pq.offer(i);

        for (int i = 0; i <= k; i++) {
            if (k-1==(i))
                return pq.poll();
            pq.poll();
        }
        return 1;
    }
    public static void main(String[] args) {
        L215 obj=new L215();
        System.out.println(obj.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
