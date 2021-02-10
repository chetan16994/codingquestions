package easy;

import java.util.Arrays;

public class L1389_Improvised {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        for (int i = 0; i < index.length; i++) {
            int temp = nums[i];
            int value = temp;
            int pos = index[i];
            while (result[pos] != -1) {
                temp = result[pos];
                result[pos++] = value;
                value = temp;
            }
            result[pos] = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        L1389_Improvised obj = new L1389_Improvised();
        int[] arr = obj.createTargetArray(nums, index);
        for (int i : arr)
            System.out.println(i);
    }
}
