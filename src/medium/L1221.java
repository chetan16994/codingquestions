package medium;

public class L1221 {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='R') r++;
            else l++;

            if (r==l && l!=0) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        L1221 obj=new L1221();
        System.out.println(obj.balancedStringSplit("RLRRLLRLRL"));
    }
}
