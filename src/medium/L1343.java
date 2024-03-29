package medium;

public class L1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(i>=k-1){
                if ((sum/k)>= threshold)
                    ans++;
                sum -= arr[i-(k-1)];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        L1343 obj=new L1343();
        System.out.println(obj.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
    }
}
