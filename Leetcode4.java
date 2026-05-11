//https://leetcode.com/problems/richest-customer-wealth/submissions/2000490055/
public class Leetcode4{
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int [][] accounts){
        int m=accounts.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}