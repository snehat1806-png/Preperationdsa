package leetcode;
public class Leetcode2{
//https://leetcode.com/problems/concatenation-of-array/submissions/1999432152/
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans=getConcatenation(nums);
        //here we are using for each loop to print the ans array which is the concatenation of the nums array with itself
        //we are using for each loop because it is more concise and easier to read than a traditional for loop
        //int means data type of the elements in the ans array and i is the variable that will take the value of each element in the ans array one by one  
        //we are using System.out.print(i+" ") to print the value of i followed by a space so that the output is in the same line and separated by spaces
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    static int[] getConcatenation(int[] nums) {
        //here we are creating a new array ans of size nums.length*2 because we want to concatenate the nums array with itself
        int[] ans=new int[nums.length*2];
        //here we are using a for loop to iterate through the nums array and fill the ans array with the values of nums array and its concatenation
        for(int i=0;i<nums.length;i++){
            //here we are filling the first half of the ans array with the values of nums array and the second half of the ans array with the same values of nums array to achieve the concatenation
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }    
}