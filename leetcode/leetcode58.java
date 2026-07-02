public class leetcode58 {
//finding peak element in an array
/*         4
        3      2
       2        1
      1
 */  
   public static void main(String[] args){
         int arr[]={1,2,3,4,2,1};
         System.out.println(findPeakElement(arr));
   } 
   public static int findPeakElement(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
               left=mid+1;
            }
            else{// arr[mid]>arr[mid+1]
                right=mid;
            }
        }
        return arr[right];
   }
}
