package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new ArrayList<>();
        int cont=0;
        int start=-1;
        if(s.length()<3)
            return res;
        for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i)==s.charAt(i-1)) {
                    if (start==-1)
                        start=i-1;
                    cont++;

                    if(i==s.length()-1 && cont>=2){
                        res.add(Arrays.asList(new Integer[]{start,i}));
                    }
                }
                else if(cont>=2){
                    res.add(Arrays.asList(new Integer[]{start,i-1}));
                    start=-1;
                    cont=0;
                }
                else {
                    cont = 0;
                    start=-1;
                }
        }
        return res;
    }
    public static void main(String[] args) {
        L830 obj=new L830();
        String s= "bbacaabaccccbab"
                ;
        System.out.println(obj.largeGroupPositions(s));
    }
}
