package easy;

import java.util.Stack;

public class L1598 {
    public int minOperations(String[] logs) {
        Stack st=new Stack();
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./"))
                continue;
            else if(logs[i].equals("../"))
                    if (!st.isEmpty())
                        st.pop();
                    else
                        continue;
                else
                    st.push(logs[i]);
        }
        return st.size();
    }

    public static void main(String[] args) {
        L1598 obj=new L1598();
        System.out.println(obj.minOperations(new String[] {"./","../","./"}));
    }
}
