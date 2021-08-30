package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class L1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for (int i:stones)
            pq.add(i);

        int lw=0;
        int st1,st2=0;
        while (pq.size()>1){
            st1= pq.poll();
            st2= pq.poll();

            if (st1!=st2)
                pq.add(st1-st2);
        }

        if (pq.size()==1)
            lw= pq.poll();

        return lw;
    }
    public static void main(String[] args) {
        L1046 obj=new L1046();
        System.out.println(obj.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
