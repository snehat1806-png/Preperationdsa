package leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class leetcode16{
    public static void main(String[] args){
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        //brute force approach
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digits=0;
            while(nums[i]>0){
                digits++;
                nums[i]/=10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}