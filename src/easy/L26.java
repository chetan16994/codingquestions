package easy;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length==0)
            return 0;
        int count=0;
        int j=0;
        int i=0;
        for(i=0;i<length-1;i++){
            if(nums[i+1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }else{
                count++;
            }
        }
        nums[j]=nums[i];
        System.out.println(nums[j]);
        System.out.println("count :"+count);
        return length-count;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        L26 obj=new L26();
        int l=obj.removeDuplicates(arr);
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }
    }
}
