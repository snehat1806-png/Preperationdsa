//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class leetcode42{
    public static void main(String[] args)//psvm meaning is public for anyone to access, static means it can be called without creating an object of the class, void means it does not return any value, main is the name of the method, String[] args is an array of strings that can be passed as command line arguments
    {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
    public static int[] searchRange(int[] nums,int target){
        int first=findFirst(nums,target,0,nums.length-1);
        int last=findLast(nums,target,0,nums.length-1);
        return new int[]{first,last};
    }
    public static int findFirst(int[] nums,int target,int left,int right){
        int first=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;//keep searching in the left half to find the first occurrence
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return first;
    }
    public static int findLast(int[] nums,int target,int left,int right){
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;//keep searching in the right half to find the last occurrence
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return last;
    }
}
