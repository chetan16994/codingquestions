package easy;

import java.util.Stack;

public class L682 {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")){
                st.pop();
            }
            else if(ops[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(ops[i].equals("+")){
                st.push(st.peek()+st.get(st.size()-2));
            }
            else{
                st.push(Integer.parseInt(ops[i]));
            }
        }
        int sum=0;
        while (!st.isEmpty()){
            sum+=st.pop();
        }
      return sum;
    }
    public static void main(String[] args) {
        L682 obj=new L682();
//        String [] str={"5","2","C","D","+"};
        System.out.println(obj.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
