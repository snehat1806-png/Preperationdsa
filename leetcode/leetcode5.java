package leetcode;
//https://leetcode.com/problems/shuffle-the-array/submissions/2001394690/
public class leetcode5{
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] ans=shuffle(nums,n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] shuffle(int[] nums, int n){
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+n];
        }
        return ans;
    }
}