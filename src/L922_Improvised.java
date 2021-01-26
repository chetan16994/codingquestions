public class L922_Improvised {
    public int[] sortArrayByParityII(int[] arr) {
        int[] newArr=new int[arr.length];
        int even=0;
        int odd=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                newArr[even]=arr[i];
                even+=2;
            }else {
                newArr[odd]=arr[i];
                odd+=2;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        L922_Improvised obj=new L922_Improvised();
        int[] arr={4,2,5,7};
        System.out.println(obj.sortArrayByParityII(arr));
    }
}
