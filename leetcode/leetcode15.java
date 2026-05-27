package leetcode;
//https://leetcode.com/problems/matrix-diagonal-sum/submissions/2009311360/
public class leetcode15{
    public static void main(String[] args){
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
    static int diagonalSum(int [][]mat){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                // if(i==j || i+j==mat.length-1){
                //     sum+=mat[i][j];
                if(i==j){
                    sum+=mat[i][j];
                }
                if(i!=mat.length-1-i){
                    sum+=mat[i][mat.length-1-i];
                }
                }
            
            }
            return sum;
        }
    }
