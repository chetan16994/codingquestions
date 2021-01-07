public class L1646 {
    public int getMaximumGenerated(int n){
        if( n <= 0){
            return 0;
        }
        int nums[]=new int[n+1];
        int res = 1;
        nums[0] = 0;
        nums[1] = 1;

        for(int  i = 2 ; i <=n  ;i++){
            if(i%2 == 0){
                nums[i] = nums[i/2];
            }else{
                nums[i] = nums[i/2]  + nums[i-i/2];
            }
            res = Math.max(res,nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        L1646 obj=new L1646();
        System.out.println(obj.getMaximumGenerated(4));
    }
}
