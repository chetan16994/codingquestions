import java.util.Arrays;

public class SumOfPair{
    public int heightChecker(int[] arr) {

        int counter =0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    counter++;
                }
            }

        return counter;
    }
    public static void main(String[] args) {
        int[] arr={1,1,4,2,1,3};
        SumOfPair obj =new SumOfPair();
        System.out.println(obj.heightChecker(arr));
        }
    }

