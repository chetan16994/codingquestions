package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr1) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(arr1);

        int min=Integer.MAX_VALUE;

        for(int i=0; i< arr1.length-1; i++)
        {
            if(arr1[i+1]-arr1[i]<min)
                min = arr1[i+1]-arr1[i];
        }

        for (int i= 0; i < arr1.length-1; i++) {
            if((arr1[i+1]-arr1[i])==min){
                answer.add(new ArrayList<Integer>(Arrays.asList(arr1[i], arr1[i+1])));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
//        int[] arr={40,11,26,27,-20};
        int[] arr={4,2,1,3};
        L1200 obj=new L1200();
        List<List<Integer>> li=new ArrayList<>();
        
        li=obj.minimumAbsDifference(arr);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }
}
