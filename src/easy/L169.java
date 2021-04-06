package easy;

import java.util.Arrays;
import java.util.HashMap;

public class L169 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i=0;
        int maj=n/2;

        HashMap<Integer,Integer> hash=new HashMap<>();
        while(i<n) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
            if (hash.getOrDefault(nums[i], 0) > maj)
                return nums[i];
            i = i + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        L169 obj=new L169();
        int[] arr={3,2,3};
        System.out.println(obj.majorityElement(arr));
    }
}