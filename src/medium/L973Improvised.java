package medium;

import java.util.PriorityQueue;

public class L973Improvised {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
                (o1,o2)-> {
                    int d1 = o1[0]*o1[0]+o1[1]*o1[1];   //calculating distance of point 1 from origin
                    int d2 = o2[0]*o2[0]+o2[1]*o2[1];  // calculating distance of point 2 from origin
                    return d1-d2;
                });
        for(int[] p: points){
            pq.offer(p);
//            if(pq.size()>=k)
//                break;
        }
//        while (!pq.isEmpty()){
//            int[] temp=pq.poll();
//            System.out.println(temp[0]+ " , "+temp[1]);
//        }

        int[][] res = new int[k][2];
        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        L973Improvised obj=new L973Improvised();
        for (int[] point : obj.kClosest(new int[][]{ {3,3},{5,-1},{-2,4}},2))
            System.out.println(point[0]+" : "+point[1]);

    }
}
