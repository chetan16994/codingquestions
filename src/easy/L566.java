package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length * mat[0].length)!=r*c) return mat;
        Queue q=new LinkedList();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                q.add(mat[i][j]);
            }
        }
        int[][] ans=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j]=(int)q.poll();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        L566 obj=new L566();
        int[][] ans=new int[1][4];
        ans=obj.matrixReshape(new int[][]{{1,2},{3,4}},1,4);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
