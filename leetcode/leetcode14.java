package leetcode;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/2008441111/
public class leetcode14 {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                matrix[indices[i][0]][j]++;
            }
            for(int k=0;k<m;k++){
                matrix[k][indices[i][1]]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}