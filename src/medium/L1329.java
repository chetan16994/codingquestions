package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1329 {
    Map<Integer, List> map = new HashMap<Integer, List>();
    ArrayList arr=new ArrayList();

    public void diagonalSort(int[][] mat) {
        int mat_row_length=mat.length;
        int mat_col_length=mat[0].length;
        System.out.println(mat_col_length);
        System.out.println(mat_row_length);

        for(int i=0; i<mat_row_length; i++){
            for(int j=0; j<mat_col_length ; j++){
//                if(!map.containsKey(i-j)) map.put(i-j,);
//                map.get(i-j).add(mat[i][j]);
                arr.add(mat[i-j]);
                System.out.println("index: "+i+" "+j+" , "+mat[i][j]);
            }
        }

//        for (int i = 0; i <mat_row_length  ; i++) {
//            for (int j = 0; j < mat_col_length; j++) {
//                System.out.println(" index : "+i+" , "+j+" "+ mat[i][j]);
//            }
//        }
//        System.out.println("diagonal --");
//
//        for (int j = 0; j < mat_col_length; j++) {
//            System.out.println(" index --: "+0+" , "+j+" "+ mat[0][j]);
//            for (int i = 0,k=j; k<mat_col_length-1 && i<mat_row_length-1 ;i++,k++ ) {
//                System.out.println(" index : "+(i+1)+" , "+(k+1) +" "+ mat[i+1][k+1]);
//            }
//        }
//        System.out.println("after sort");
//        for (int i = 0; i <mat_row_length  ; i++) {
//            for (int j = 0; j < mat_col_length; j++) {
//                System.out.println(" index : "+i+" , "+j+" "+ mat[i][j]);
//            }
//        }
    }

    public static void main(String[] args) {
        int [][]mat=new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        L1329 obj=new L1329();
        obj.diagonalSort(mat);
    }
}
