package easy;

public class L832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length ; row++) {
            for (int revCol=image[row].length-1,col = 0; col < image[row].length/2; col++,revCol--) {
                int temp=image[row][col];
                image[row][col]=image[row][revCol];
                image[row][revCol]=temp;
            }
        }
        for (int row = 0; row < image.length ; row++) {
            for (int col = 0; col < image[row].length; col++) {
                if(image[row][col]==0) image[row][col]=1;
                else image[row][col]=0;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        L832 obj=new L832();
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};

        int[][] res=obj.flipAndInvertImage(image);
        for (int row = 0; row < res.length ; row++) {
            for (int col = 0; col < res[row].length; col++) {
                System.out.println(res[row][col]);
            }
        }
    }
}
