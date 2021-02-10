package medium;

public class L1701 {
    public double averageWaitingTime(int[][] arr) {
        int arr_length= arr.length;
        int[] wait=new int[arr_length];
        wait[0]=arr[0][1];
        int temp=0;
        double sum=wait[0];
        for (int i = 1; i < arr_length; i++) {
            temp=wait[i-1]-(arr[i][0]-arr[i-1][0]);
            wait[i]=temp>0?(temp+arr[i][1]):arr[i][1];
            sum=wait[i]+sum;
        }
        return (sum/arr_length);
    }
    public static void main(String[] args) {
        L1701 obj=new L1701();
        int[][] customers={{5,2},{5,4},{10,3},{20,1}};
        System.out.println(obj.averageWaitingTime(customers));
    }
}
