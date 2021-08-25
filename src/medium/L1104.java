package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1104 {
    public List<Integer> pathInZigZagTree(int label) {
        int min,max=1;
        ArrayList<Integer> res=new ArrayList();
        if (label==1) {
            res.add(1);
            return res;
        }
        int level=1;

        while(max<label){

           max += (int) (Math.pow(2,level));
            level++;
        }

        while(level>0){
            res.add(label);
            max=(int) (Math.pow(2,level)-1);

            level--;
            label= (max-label)/2 + (int) Math.pow(2,level-1);
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        L1104 obj=new L1104();
        System.out.println(obj.pathInZigZagTree(26));
    }
}
