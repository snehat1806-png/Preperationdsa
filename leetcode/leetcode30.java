//https://leetcode.com/problems/rotate-array/submissions/2020857095/
public class leetcode30{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    static void rotate(int[] nums,int k){
        k=k%nums.length;//To handle cases where k is greater than the length of the array, we take the modulus of k with the length of the array
        reverse(nums,0,nums.length-1);//First, we reverse the entire array to get the elements in the correct order for rotation
        reverse(nums,0,k-1);//Next, we reverse the first k elements to move them to their correct positions
        reverse(nums,k,nums.length-1);//Finally, we reverse the remaining elements to move them to their correct positions
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}