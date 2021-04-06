package easy;

import java.util.HashMap;

public class L169_MooreVoting {
    public int majorityElement(int[] nums) {
        int majElement=nums[0];
        int count=1;

        for (int i = 1 ; i < nums.length; i++) {
            if (nums[i]==majElement)
                count++;
            else{
                if (count>0)
                    count--;
                else {
                    majElement=nums[i];
                    count=1;
                }
            }
        }

        return majElement;
    }
    public static void main(String[] args) {
        L169_MooreVoting obj=new L169_MooreVoting();
        
    }
}
