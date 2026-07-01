public class leetcode56 {
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/2051715651/
public static void main(String[] args) {
      int[] nums = {2,5,6,0,0,1,2};
    int target = 0;
    System.out.println(search(nums, target));
}   
public static boolean search(int[] nums,int target){
    int left=0;
    int right=nums.length-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return true;
        }
        //for duplicates
        if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
            left++;
            right--;
        }//left sorted elements
        else if(nums[left]<=nums[mid]){
            if(target>=nums[left]&&target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }  
        }//right sorted elements
        else{//nums[right]>=nums[mid]
            if(target>nums[mid]&&target<=nums[right]){
               left=mid+1;
            }else{
                right=mid-1;
            }
        }
    }
    return false;
} 
}
