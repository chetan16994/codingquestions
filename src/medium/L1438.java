package medium;

import java.util.Arrays;

public class L1438 {
    int res=1;
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        for (int k = n; k >1 ; k--) {
            for (int i = 0; i < (n-k)+1; i++) {
                if (find(nums,i,i+k-1,limit)) {
                    return res;
                }
            }
        }
        return res;
    }
    public Boolean find(int[] arr,int min,int max, int limit){
        int length=max-min+1;
//        int[] temp=new int[length];
//        for (int i = min,j=0; i <=max ;j++, i++) {
//            temp[j]=arr[i];
//        }
        int[] temp=Arrays.copyOfRange(arr,min,max+1);

        Arrays.sort(temp);

        if (Math.abs(temp[0] - temp[temp.length-1]) <= limit){
            res=length;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        L1438 obj=new L1438();
//        System.out.println(obj.longestSubarray(new int[]{4,2,2,2,4,4,2,2},0));
//        System.out.println(obj.longestSubarray(new int[]{10,1,2,4,7,2},5)); //4
        System.out.println(obj.longestSubarray(new int[]{8,2,4,7},4)); //2
    }
}
