//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
public class leetcode46{
    public static void main(String[] args){
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums){
        for(int x=0;x<=nums.length;x++){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
                if(count==x){
                    return x;
                }
        }
        return -1;
    }
}