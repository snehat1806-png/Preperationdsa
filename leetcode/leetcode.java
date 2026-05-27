package leetcode;
public class leetcode {
//https://leetcode.com/problems/build-array-from-permutation/submissions/1999064351/
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int[] ans=buildArray(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }    
}
