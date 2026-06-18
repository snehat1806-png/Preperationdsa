import java.util.Arrays;
import java.util.ArrayList;

public class leetcode45 {
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public static void main(String[] args){
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};

    int[] result = intersect(nums1, nums2);

    System.out.print("[");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);

        if (i < result.length - 1) {
            System.out.print(",");
        }
    }
    System.out.println("]");
}    
public static int[] intersect(int[] nums1,int[] nums2){
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer> answer=new ArrayList<>();//we can also use list instead of arraylist but here we are using arraylist because we can easily add elements to it and it will automatically resize itself when needed.
    //used to create new arraylist
    int i=0,j=0;
    while(i<nums1.length&&j<nums2.length){
        if(nums1[i]==nums2[j]){
            answer.add(nums1[i]);
            i++;
            j++;
        }
        else if(nums1[i]<nums2[j]){
            i++;
        }
        else{
            j++;
        }
    }
    int[] result=new int[answer.size()];//we are creating new array of size of answer list
    for(int k=0;k<answer.size();k++){
        result[k]=answer.get(k);//we are getting the elements from answer list and storing it in result array
    }
    return result;
}
}
