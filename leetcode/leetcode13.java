package leetcode;
public class leetcode13 {
//https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result=flipAndInvertImage(image);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        int[][] result=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=image[i][n-1-j]==1?0:1;
            }
        }
        return result;
    }
}
