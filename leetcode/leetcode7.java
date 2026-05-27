package leetcode;
public class leetcode7 {
//https://leetcode.com/problems/number-of-good-pairs/submissions/2002704685/
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int ans=numIdenticalPairs(nums);
        System.out.println(ans);
    }
    static int numIdenticalPairs(int[] nums){
        int pair=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pair++;
                }
            }
        }
        return pair;
    }    
}
