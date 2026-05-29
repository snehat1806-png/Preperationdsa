import java.util.ArrayList;
import java.util.List;

public class leetcode23 {
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/2016609079/
     public static void main(String []args){
        int [][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
     }
     static List<Integer> luckyNumbers(int [][] matrix){
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][index]>min){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans.add(min);
            }
        }
        return ans;

     }
}
