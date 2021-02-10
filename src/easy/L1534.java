package easy;

public class L1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                if ( Math.abs(arr[i]-arr[j])<=a){
                    for (int k=j+1;k< arr.length;k++){
                        if ( Math.abs(arr[j]-arr[k])<=b)
                            if( Math.abs(arr[i]-arr[k])<=c)
                                count++;
                    }
                }
            }
            }
            return count;
        }
    public static void main(String[] args) {
        L1534 obj=new L1534();
        int []arr = {1,1,2,2,3};
        System.out.println(obj.countGoodTriplets(arr,0,0,1));
    }
}
