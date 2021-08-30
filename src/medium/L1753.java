package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class L1753 {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);

        int t1,t2,ans=0;
        while (pq.size()>1){
            t1=pq.poll()-1;
            t2=pq.poll()-1;

            if (t1!=0)
                pq.add(t1);

            if (t2!=0)
                pq.add(t2);

            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        L1753 obj=new L1753();
        System.out.println(obj.maximumScore(6,2,1));
    }
}