package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        Stack<Integer> st=new Stack();
        int lenTarget=target.length;
        for (int i = 0,j=0; i < n && j< lenTarget; i++) {
            st.push(i+1);
            res.add("Push");
            if (st.peek()!=target[j]){
                st.pop();
                res.add("Pop");
            }else {
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        L1441 obj=new L1441();
        int[] arr={1,2};
        System.out.println(obj.buildArray(arr,4));
    }
}
