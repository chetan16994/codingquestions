package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class L1464 {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i: nums)
            pq.add(i);

        return ((pq.poll()-1)*(pq.poll()-1));
    }

    public static void main(String[] args) {
        L1464 obj=new L1464();
        System.out.println(obj.maxProduct(new int[]{3,4,5,2}));
    }

}
