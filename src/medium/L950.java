package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        List<Integer> li = new ArrayList<Integer>(deck.length);
        for (int i : deck)
        {
            li.add(i);
        }

        List<Integer> cloned_list=new ArrayList<>(li);

        int[] arr2=new int[deck.length];
        int n=li.size();
        int k=0;
        for (int i = 0; i < n; i++) {
            if (k > li.size() - 1){
                if(li.size()==1)
                    k=0;
                else
                    k = k-li.size() ;
            }
            arr2[i]= cloned_list.indexOf(li.get(k))+1;
            li.remove(k);
            k+=1;
        }

        int[] res=new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            res[arr2[i]-1]=deck[i];
        }
        return res;
    }

    public static void main(String[] args) {
       L950 obj =new L950();
       int[] res=obj.deckRevealedIncreasing(new int[] {2,4,6,8,11,13});
       for (int i:res)
           System.out.println(i);
    }
}
