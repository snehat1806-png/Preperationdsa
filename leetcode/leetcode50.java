public class leetcode50 {
// https://leetcode.com/problems/find-peak-element/submissions/2044865691/
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }   
}
