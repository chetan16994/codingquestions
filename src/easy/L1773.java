package easy;


import java.util.Arrays;
import java.util.List;


public class L1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int ruleIndex;
        if (ruleKey=="type")
            ruleIndex=0;
        else if(ruleKey=="color")
                ruleIndex=1;
            else
                ruleIndex=2;

        System.out.println(ruleIndex);
            int ans=0;

        for (List innerList : items){
            if (ruleValue==innerList.get(ruleIndex)) {
                ans++;
                System.out.println(innerList.get(ruleIndex));
            }
        }
//        for(int i=0;i<items.size();i++){
//            if (ruleValue.equals(items.get(i).get(ruleIndex))) {
//                ans++;
//                System.out.println(items.get(i).get(ruleIndex));
//            }
//        }



        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> li= Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));

//        System.out.println(li);
        L1773 obj=new L1773();
        System.out.println(obj.countMatches(li,"color","silver"));
    }
}
