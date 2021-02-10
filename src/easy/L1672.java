package easy;

public class L1672 {
    public int maximumWealth(int[][] arr) {
        int maxSum=0;
        if(arr.length==0) return 0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[][]={
                {1,22,44},{12,33,14},{45,3,33}
        };
        L1672 obj=new L1672();
        System.out.println(obj.maximumWealth(arr));
    }
}