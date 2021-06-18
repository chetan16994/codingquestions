package easy;

import java.util.Stack;

public class L20 {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.empty()){
                if ((s.charAt(i)=='}' && st.peek()=='{') || (s.charAt(i)==')' && st.peek()=='(' || (s.charAt(i)==']' && st.peek()=='[')))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }else
                st.push(s.charAt(i));
        }
        for (Character c:st)
            System.out.println(c);
        return st.size()==0;
    }
    public static void main(String[] args) {
        L20 obj=new L20();
        System.out.println(obj.isValid("()"));
    }
}
