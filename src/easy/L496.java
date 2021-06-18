package easy;

import java.util.Stack;

public class L496 {
    Stack<Integer> st=new Stack<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res=new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i]=returnPosition(nums1[i]);
        }
      return res;
    }
    public int returnPosition(int ele){
        int index=st.size()-st.search(ele);
        if(index==3)
            return -1;
        for (int i = index+1; i <st.size() ; i++) {
            if (st.get(i)>ele) {
                return st.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        L496 obj=new L496();
        int[] res= obj.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        for (int i:res)
            System.out.println(i);
    }
}
