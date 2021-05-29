package easy;

import java.util.Stack;

public class L1047 {
    public static String removeDuplicates(String S) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if(!st.isEmpty() && st.peek()==S.charAt(i))
                st.pop();
            else
                st.push(S.charAt(i));
        }
        while (!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println(removeDuplicates(s));
        
    }
}
