package easy;

public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            for (int i = 0; i < n; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }
        if(m==1 && n==1){
            if(nums1[0]>nums2[0]){
                int temp=nums1[0];
                nums1[0]=nums2[0];;
                nums1[1]=temp;
            }else {
                nums1[1] = nums2[0];
            }
            return;
        }
            while(!(m==0 && n==0)) {
                if ((m > 0 && n > 0) && nums1[m - 1] >= nums2[n - 1]) {
                    nums1[m + n - 1] = nums1[m - 1];
                    m--;
                } else if (n == 0) {
                    nums1[m + n - 1] = nums1[m - 1];
                    m--;
                } else {
                    nums1[m + n - 1] = nums2[n - 1];
                    n--;
                }
            }
    }
    public static void main(String[] args) {
        L88 obj=new L88();
        obj.merge(new int[]{1,2,3,0,0,0},3,new int[] {2,5,6},3);
    }
}
