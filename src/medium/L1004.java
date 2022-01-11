package medium;

public class L1004 {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int start=0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ++count;
            }

            while (count > k) {
                if (nums[start++] == 0) {
                    --count;
                }
            }

            maxLength = Math.max (maxLength, i - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        L1004 obj=new L1004();
        System.out.println(obj.longestOnes(new int[]{0,1,1,1,0,1,1,0,1},2));
    }
}
