public class L1480 {
    public int[] runningSum(int[] arr) {

        if(arr.length==0) return arr;
        int[] arr2=new int[arr.length];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            arr2[i]=sum;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        L1480 obj=new L1480();
        int[] arr2=obj.runningSum(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
