//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class leetcode22{
    public static void main(String []args){
        int n=5;
        int [] ans = sumZero(n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] sumZero(int n){
        int []ans=new int[n];
        int index=0;
        for(int i=1;i<n/2;i++){
           ans[index++]=i;
           ans[index++]=-i;
        }
        if(n%2==1){
            ans[index]=0;
        }
        return ans;
    }
}
