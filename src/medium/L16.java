package medium;

public class L16 {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff=Integer.MAX_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int diff=Math.abs(target - (nums[i]+nums[j]+nums[k]));
                    if (diff<minDiff) {
                        minDiff = diff;
                        sum=nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        L16 obj=new L16();
        int[] arr={-1,2,1,-4};
        System.out.println(obj.threeSumClosest(arr,1));
    }
}
