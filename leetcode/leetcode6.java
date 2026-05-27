package leetcode;
import java.util.ArrayList;
import java.util.List;

public class leetcode6 {
 //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> ans=kidsWithCandies(candies,extraCandies);
        for(Boolean i:ans){
            System.out.print(i+" ");
        }
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int i:candies){
            max=Math.max(max,i);
        }
        for(int i:candies){
            if(i+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }   
}
