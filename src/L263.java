public class L263 {
    public boolean isUgly(int num) {

        if(num<=0) return false;
        if(num==1) return true;

        while(num!=1){
            if(num%2==0)
                num/=2;
            else if(num%3==0)
                num/=3;
            else if(num%5==0)
                num/=5;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num=-16;
        L263 obj=new L263();
        System.out.println(obj.isUgly(num));
    }
}
