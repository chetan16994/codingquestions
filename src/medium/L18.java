package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n-3; i++) {
            System.out.println(" i : "+i);
            for (int j = i+1; j <n-2; j++) {
                System.out.println(" j : "+j);
                int pointer1=nums[j+1];
                int pointer2=nums[n-1];
                while (pointer1<pointer2){
                    int sum=nums[i]+nums[j]+nums[pointer1]+nums[pointer2];
                    System.out.println(sum);
                    if (sum==target)
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[pointer1],nums[pointer2])) );
                    if (sum<target)
                        pointer1++;
                    else
                        pointer2--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        L18 obj=new L18();
//        List<List<Integer>> res=new ArrayList<>();
        System.out.println(obj.fourSum(new int[] {1,0,-1,0,-2,2,7}, 0));
    }
}