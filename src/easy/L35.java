package easy;

public class L35 {

        public int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)
                    return i;
                if(nums[i]>target)
                    return i;
            }
            return (nums.length);
        }

    public static void main(String[] args) {
        L35 obj=new L35();
        int[] arr={1,3,5,6};
        int target=0;
        System.out.println(obj.searchInsert(arr,target));
    }
}
