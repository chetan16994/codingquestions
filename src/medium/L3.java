package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(""))
            return 0;
        if (s.length()==1)
            return 1;

        int ans=0;
        int count=0;
        
        Map<Character,Integer> map=new HashMap<>();
        Set<Character> set=new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                count=0;
                i=map.get(s.charAt(i))+1;
                map.clear();
            }
            map.put(s.charAt(i),i);
            count++;
            ans=Math.max(count,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        L3 obj=new L3();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
    }
}
