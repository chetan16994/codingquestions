package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1002 {
    public List<String> commonChars(String[] words) {
        List<Map<Character,Integer>> list=new ArrayList<>();
        List<String> ans=new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> map=new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);
            }
            list.add(map);
        }

        Map<Character,Integer> first=list.get(0);
        System.out.println(list);

        for (Character ch: first.keySet()) {
            while (first.get(ch) > 0) {
                boolean found = true;
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(j).containsKey(ch) && list.get(j).get(ch)>0) {
                        list.get(j).put(ch, list.get(j).get(ch) - 1);
                    } else {
                        found = false;
                    first.put(ch,-1);
                        break;
                    }
                }
                if (found) {
                    ans.add(ch.toString());
                }
                first.put(ch, first.get(ch) - 1);
                System.out.println(list);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        L1002 obj=new L1002();
        System.out.println(obj.commonChars(new String[] { "cool","lock","cook" }));
    }
}
