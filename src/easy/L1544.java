package easy;

import java.util.Stack;

public class L1544 {
    public String makeGood(String s) {
        Stack<Character> st=new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty())
                st.push(s.charAt(i));
            else if (!st.isEmpty() && Math.abs(st.peek() - s.charAt(i)) == 32)
                st.pop();
            else
                st.push(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while (!st.isEmpty())
            res.append(st.pop());

        return res.reverse().toString();

    }
    public static void main(String[] args) {
        L1544 obj=new L1544();
        String res=obj.makeGood(new String("pP"));
        System.out.println(res);
    }
}
