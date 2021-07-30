package easy;

public class L1791 {
    public int findCenter(int[][] edges) {
        if (edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1])
            return edges[0][0];
        return edges[0][1];
    }

    public static void main(String[] args) {
        int[][] arr={{1,2},{2,3},{4,2}};
        L1791 obj=new L1791();
        System.out.println(obj.findCenter(arr));
    }
}
