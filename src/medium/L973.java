package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L973 {
    public int[][] kClosest(int[][] points, int k) {
        Map<Double, Integer> map=new HashMap<>();
        PriorityQueue<Double> pq=new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            double x=Math.sqrt((Math.pow(points[i][0],2 ) + (Math.pow(points[i][1],2 ))));
            if (map.containsKey(x)) {
                double temp=x + getRandom();
                map.put(temp, i);
                pq.add(temp);
            }
            else {
                map.put(x, i);
                pq.add(x);
            }
        }

        int i=0;
        int[][]a = new int[k][2];
        while (i<k){
            a[i]=points[map.get(pq.poll())];
            i++;
        }
        return a;
    }
    public double getRandom(){
        return  ((Math.random() * (0.01 - 0.001)) + 0.001 );
    }
    public static void main(String[] args) {
        L973 obj=new L973();
        for (int[] i: obj.kClosest(new int[][]{ {2,2},{2,2},{2,2},{2,2},{2,2},{2,2}, {1,1} },1))
            System.out.println(i[0]+" , "+i[1]);
    }
}
