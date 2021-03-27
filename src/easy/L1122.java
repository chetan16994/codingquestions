package easy;

import java.util.Arrays;
import java.util.HashMap;

public class L1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hash1=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (hash1.containsKey(arr1[i]))
                hash1.put(arr1[i],hash1.get(arr1[i])+1);
            else
                hash1.put(arr1[i], 1);
        }
        int[] res=new int[arr1.length];
        Arrays.sort(arr1);
        int k=0;
        for (int i = 0; i < arr2.length;k++) {
            if (hash1.get(arr2[i])==1){
                hash1.put(arr2[i],hash1.get(arr2[i])-1);
                res[k]=arr2[i];
                i++;
            }else {
                res[k]=arr2[i];
                hash1.put(arr2[i],hash1.get(arr2[i])-1);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (hash1.get(arr1[i])>0){
                res[k]=arr1[i];
                hash1.put(arr1[i],hash1.get(arr1[i])-1);
                k++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        L1122 obj=new L1122();
        int [] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = {2,42,38,0,43,21};
        int[] res=obj.relativeSortArray(arr1,arr2);
        for (int i:res)
            System.out.println(i);
    }
}
