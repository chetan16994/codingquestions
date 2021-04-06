package easy;

public class L1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cont=0;
            while (i<arr.length && arr[i]%2!=0) {
                i++;
                cont++;
            }
            if (cont==3)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        L1550 obj=new L1550();
        int[] arr={2,6,1,3,5,4,1};
        System.out.println(obj.threeConsecutiveOdds(arr));
    }
}
