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
     
    //     List<Integer> list=new ArrayList<>();

    //     for(int i=0;i<nums.length;i++){
    //      list.add(index[i],nums[i]);
    //     }
    //     int[] target=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         target[i]=list.get(i);
    //     }
    //  return target;
    int[] target=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        //if the index is same as the current index then we can directly put the element in the target array
        if(index[i]==i){
            target[index[i]]=nums[i];
            continue;
        }
        for(int j=target.length-1;j>index[i];j--){//shift the element to right and make space for the new element working from the end of the array or else we will overwrite the element at index[i]
            target[j]=target[j-1];
        }
        target[index[i]]=nums[i];
     }
        return target;
}
}