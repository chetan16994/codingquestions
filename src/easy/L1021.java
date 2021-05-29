package easy;

import java.util.Stack;

public class L1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder str=new StringBuilder();
        Stack <Character> st=new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (st.size()>0){
                if(S.charAt(i)=='(')
                    st.push('(');
                else {
                    st.pop();
                    if (st.size()==0)
                        continue;
                }
                str.append(S.charAt(i));
            }else{
                st.push('(');
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str="(()())(())";
        L1021 obj=new L1021();
        System.out.println(obj.removeOuterParentheses(str));
    }
}
