package easy;

public class L121 {
    public int maxProfit(int[] prices) {
        int max=0, min=prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (min<prices[i]){
                max=Math.max(prices[i]-min,max);
            }else{
                min=prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        L121 obj = new L121();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,3}));
    }
}
