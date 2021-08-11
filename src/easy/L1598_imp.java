package easy;

import java.util.Collections;
import java.util.Stack;

public class L1598_imp {
    public int minOperations(String[] logs) {
        Stack st=new Stack();
        for (int i = 0; i < logs.length; i++) {
            st.push(logs[i]);
        }
        Collections.reverse(st);
        int min=0;
        while(!st.isEmpty()){
            if (st.peek().equals("./"))
                st.pop();
            else if(st.peek().equals("../")) {
                if (min > 0)
                    min -= 1;
                st.pop();
            }
            else{
                min++;
                st.pop();
            }

        }
        return min;
    }

    public static void main(String[] args) {
        L1598_imp obj=new L1598_imp();
        System.out.println(obj.minOperations(new String[] {"./","../","./"}));
    }
}
