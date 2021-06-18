package easy;

import java.util.Stack;

public class L844 {
        public boolean backspaceCompare(String s, String t) {
            Stack<Character> st1=new Stack();
            Stack<Character> st2=new Stack();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='#'){
                    if (!st1.isEmpty())
                        st1.pop();
                }else{
                    st1.push(s.charAt(i));
                }
            }
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i)=='#'){
                    if (!st2.isEmpty())
                        st2.pop();
                }else{
                    st2.push(t.charAt(i));
                }
            }
            if (st1.size()!=st2.size())
                return false;

            for (int i = 0; i < st2.size(); i++) {
                if (st1.get(i)!=st2.get(i))
                    return false;
            }
            return true;
        }
    public static void main(String[] args) {
        L844 obj=new L844();
        System.out.println(obj.backspaceCompare("isfcow#",
                "isfco#w#"));
    }
}
