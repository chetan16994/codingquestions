package easy;

import java.util.*;

public class L217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) return true;

        }
        return false;
    }
    public static void main(String[] args) {
     L217 obj=new L217();
        System.out.println(obj.containsDuplicate(new int[]{1,2,3,1}));
    }
}
