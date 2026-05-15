import java.util.ArrayList;
import java.util.List;

public class leetcode9 {
//https://leetcode.com/problems/create-target-array-in-the-given-order/
public static void main(String[] args) {
    int[] nums={0,1,2,3,4};
    int[] index={0,1,2,2,1};
    int[] ans=createTargetArray(nums,index);
    for(int i:ans){
        System.out.print(i+" ");
    }
}    
static int[] createTargetArray(int[] nums, int[] index) {
     
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
         list.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=list.get(i);
        }
     return target;
    }
}
