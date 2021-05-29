package medium;

public class L695 {
    public static void main(String[] args) {
        int [][] arr=new int[][]{{1,2,3},{2,3,4},{3,4,5}};
        int matRowLen= arr.length;
        int matColLen=arr[0].length;
        for (int i = 0; i < matColLen; i++) {
            for (int j = 0; j < matRowLen; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
