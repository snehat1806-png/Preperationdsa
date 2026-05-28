//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
import java.util.Arrays;
public class leetcode21{
    public static void main(String [] args){
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
     static boolean findRotation(int[][] mat, int[][] target){
        for(int k=0;k<4;k++){
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
     }
     static void rotate(int[][]mat){
        int n=mat.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
     }

}