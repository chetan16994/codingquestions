package medium;

import java.util.Arrays;

public class L16_improvised {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=0;
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int pointerOne= i+1;
            int pointerTwo= nums.length-1;
            while (pointerOne<pointerTwo){
                int sum=nums[i]+nums[pointerOne]+nums[pointerTwo];
                if (sum==target)
                    return sum;
                if (sum<target)
                    pointerOne++;
                else
                    pointerTwo--;

                int diff=Math.abs(target - sum);

                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        L16_improvised obj=new L16_improvised();
        System.out.println(obj.threeSumClosest(new int[] {-1,2,1,-4},1));
    }
}
