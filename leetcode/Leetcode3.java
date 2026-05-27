package leetcode;
public class Leetcode3{
//https://leetcode.com/problems/running-sum-of-1d-array/submissions/1999505148/
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=runningSum(nums);
        //here we are using for each loop to print the ans array which is the running sum of the nums array
        //we are using for each loop because it is more concise and easier to read than a traditional for loop
        //int means data type of the elements in the ans array and i is the variable that will take the value of each element in the ans array one by one  
        //we are using System.out.print(i+" ") to print the value of i followed by a space so that the output is in the same line and separated by spaces
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] runningSum(int[] nums) {
        //here we are creating a new array ans of size nums.length to store the running sum of the nums array
        int[] ans=new int[nums.length];
        //here we are using a for loop to iterate through the nums array and fill the ans array with the running sum of the nums array
        for(int i=0;i<nums.length;i++){
            //here we are filling the ans array with the running sum of the nums array by adding the current element of nums array with the previous element of ans array to get the current running sum
            if(i==0){
                ans[i]=nums[i];
            }else{
                ans[i]=ans[i-1]+nums[i];
            }
        }
        return ans;
    }    
}