//https://leetcode.com/problems/spiral-matrix/submissions/2018601307/
import java.util.ArrayList;
import java.util.List;
public class leetcode28 {
    public static void main(String[] args){
        int[][] matrix = {};
        List<Integer> res = spiralOrder(matrix);
        System.out.println(res);
    }
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list=new ArrayList<>();//Initializing a list to store the spiral order of the matrix elements
        if(matrix.length==0) return list;//If the input matrix is empty, we return immediately
        int top=0;//Initializing the top boundary of the matrix to 0
        int bottom=matrix.length-1;//Initializing the bottom boundary of the matrix to the last index
        int left=0;//Initializing the left boundary of the matrix to 0
        int right=matrix[0].length-1;//Initializing the right boundary of the matrix to the last index and [0] is used to access the first row of the matrix
        while(top<=bottom&&left<=right){
            //left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;//After traversing the top row, we move the top boundary down by incrementing it
            //top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;//After traversing the right column, we move the right boundary left by decrementing it
            if(top<=bottom){
                //right to left
            for(int k=right;k>=left;k--){
                list.add(matrix[bottom][k]);
            }
            }
            bottom--;//After traversing the bottom row, we move the bottom boundary up by decrementing it
            if(left<=right){
                //bottom to top
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;//After traversing the left column, we move the left boundary right by incrementing it
        }
        return list;//Finally, we return the list containing the spiral order of the matrix elements
    }
}