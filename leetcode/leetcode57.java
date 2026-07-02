public class leetcode57 {
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public static void main(String[] args) {
    int[] arr = {4,5,6,7,8,0,1,2};
    System.out.println(findMin(arr));   
}
public static int findMin(int[] arr){
    int left=0;
    int right=arr.length-1;
    // int min=arr[0];
    // while(left<=right){
    //     int mid=left+(right-left)/2;
    //     if(arr[left]<=arr[mid]){
    //         min=Math.min(min,arr[left]);
    //         left=mid+1;
    //     }else{
    //         min=Math.min(min,arr[mid]);
    //         right=mid-1;
    //     }
    // }
    // return min;
    while(left<right){
        int mid=left+(right-left)/2;
        if(arr[mid]<arr[right]){
            right=mid;
        }else{// arr[mid]>arr[right]    
            left=mid+1;
        }
    }
    return arr[left];
}
}
