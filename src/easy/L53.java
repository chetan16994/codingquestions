package easy;

public class L53 {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        L53 obj=new L53();
        System.out.println(obj.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
