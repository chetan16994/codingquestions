import java.util.*;

public class L1389 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};

        L1389 obj = new L1389();
        int[] arr = obj.createTargetArray(nums, index);
        for (int i : arr)
            System.out.println(i);
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        // If there is only one element, return early.
        if (index.length == 1) {
            return nums;
        }

        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] arr = new int[target.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = target.get(i);
        }
        return arr;
    }
}
