public class L1701 {
    public double averageWaitingTime(int[][] arr) {
        int[] wait=new int[arr.length];
        wait[0]=arr[0][1];
        for (int i = 1; i < arr.length; i++) {

        }
        return 2.0;
    }
    public static void main(String[] args) {
        L1701 obj=new L1701();
        int[][] customers={{1,2},{2,5},{4,3}};
        System.out.println(customers[0][1]);
        System.out.println(obj.averageWaitingTime(customers));
    }
}
