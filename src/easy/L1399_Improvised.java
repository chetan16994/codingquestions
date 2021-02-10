package easy;

public class L1399_Improvised {
    public int countLargestGroup(int n){
        int ans=0;
        int[] count=new int[37]; // max sum of digits of n <= 10000 is 36 (sum of digits of 9999)
        for (int i = 1; i <= n; i++) {
            int sum=0;
            int num=i;
            while (num>0){
                sum += num%10;
                num /= 10;
            }
            count[sum]++;
        }
        int max=0;
        for(int i: count){
            max=Math.max(max,i);
        }
        for (int i: count){
            if (i==max) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        L1399_Improvised obj=new L1399_Improvised();
        System.out.println(obj.countLargestGroup(2));
    }
}
