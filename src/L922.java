public class L922 {
    public int[] sortArrayByParityII(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i%2!=0 && arr[i]%2==0) || (i%2==0 && arr[i]%2!=0)) {
                for (int j = i+1; j < arr.length; j=j+2) {
                    if (i%2==0){
                        if (arr[j]%2==0) {
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }else{
                        if (arr[j]%2!=0) {
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
      L922 obj=new L922();
      int[] arr={4,2,5,7};
        System.out.println(obj.sortArrayByParityII(arr));
    }
}
