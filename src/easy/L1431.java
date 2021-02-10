package easy;

import java.util.ArrayList;
import java.util.List;

public class L1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max=candies[0];
        for (int i = 1; i <candies.length; i++) {
            if (candies[i]>max) max=candies[i];
        }
        List<Boolean> solution = new ArrayList<>();
        for (int i: candies) {
            solution.add(i+extra>=max);
        }
        return solution;
    }
    public static void main(String[] args) {
        int [] arr={2,3,5,1,3};
        int extra=3;
        L1431 obj=new L1431();
        System.out.println(obj.kidsWithCandies(arr,extra));
    }
}
