package easy;// find mid
// start shuffle in new array

public class L1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2 * n];
        if (nums.length <= 1) return nums;

        for (int i = 0, j = 0; i < n; i++, j = j + 2) {
            newArr[j] = nums[i];
            newArr[j + 1] = nums[n + i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        L1470 obj = new L1470();
        int[] arr1 = obj.shuffle(arr, 4);
        for (int i :
                arr1) {
            System.out.println(i);
        }
    }

}
