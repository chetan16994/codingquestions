package easy;

import java.util.HashSet;
import java.util.Set;

public class L219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        L219 obj=new L219();
        System.out.println(obj.containsNearbyDuplicate(new int[] {1,2,3,4,5,5},3));
    }
}
