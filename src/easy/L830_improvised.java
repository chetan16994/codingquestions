package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L830_improvised {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 1 ; i < s.length(); i++) {
            int start=i-1;

            while (i<s.length() && s.charAt(i)==s.charAt(i-1)){
                i++;
            }
            if (i-(start)-1>=2){
                res.add(Arrays.asList(new Integer[]{start,i-1}));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        L830_improvised obj=new L830_improvised();
        String s= "aaaa";
        System.out.println(obj.largeGroupPositions(s));
    }
}
