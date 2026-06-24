//https://leetcode.com/problems/binary-search/description/
public class leetcode49{
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 19;
        System.out.println(search(arr,target));
}
    public static int search(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}