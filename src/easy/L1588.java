package easy;

public class L1588 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        L1588 obj = new L1588();
        System.out.println(obj.sumOddLengthSubarrays(arr));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int len = arr.length;
        for(int i=0; i<len; i++) {
            int sum = 0;
            int count = 0;
            for(int j=i; j<len; j++) {
                count++;
                sum += arr[j];
                if(count % 2 != 0)
                    total += sum;
            }
        }
        return total;
    }
}
