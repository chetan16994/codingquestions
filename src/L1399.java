import java.util.*;

public class L1399 {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> hash = new HashMap<>();
        int maxFrequency=0;
        for (int i = 1; i <= n; i++) {
            int sum=countDigit(i);
            int value=hash.getOrDefault(sum,0);
            hash.put(sum, value+1);
            maxFrequency=Math.max(maxFrequency,1+value);
        }

        int count=0;

        for(int key : hash.keySet()){
            if(hash.get(key) == maxFrequency) count++;
        }

        return count;
    }

    public int countDigit(int n){
        if (n/10<1)
            return n;
        int num=0;
        while (n>0){
            num=num+n%10;
            n=n/10;
        }
        return num;
    }
    public static void main(String[] args) {

        L1399 obj=new L1399();
        System.out.println(obj.countLargestGroup(15));
    }
}
