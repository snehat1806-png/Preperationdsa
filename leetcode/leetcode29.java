public class leetcode29 {
//https://leetcode.com/problems/spiral-matrix-ii/submissions/2020419970/
public static void main(String []args){
    int n=3;
    int [][] ans = generateMatrix(n,0,n-1,0,n-1);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
    }
}
static int[][] generateMatrix(int n,int top,int bottom,int left,int right){
    int [][]matrix=new int[n][n];
    int count=1;
    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            matrix[top][i]=count++;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            matrix[i][right]=count++;
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=count++;
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=count++;
            }
            left++;
        }

    }
    return matrix;
    
}
}
