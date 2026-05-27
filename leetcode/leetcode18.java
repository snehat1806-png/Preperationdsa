package leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode18 {
//https://leetcode.com/problems/add-to-array-form-of-integer/submissions/2010306708/
    public static void main(String[] args){
        int[] num={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(num,k));
    }
    static List<Integer> addToArrayForm(int[] num, int k){
       

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        int carry = 0;



        // Continue while:
        // array exists OR k exists OR carry exists
        while (i >= 0 || k > 0 || carry > 0) {

            int sum = carry;



            // Add digit from array
            if (i >= 0) {

                sum += num[i];

                i--;
            }



            // Add last digit of k
            sum += k % 10;

            // Remove last digit from k
            k /= 10;



            // Store digit
            result.add(sum % 10);



            // Update carry
            carry = sum / 10;
        }



        // Digits are reversed
        Collections.reverse(result);

        return result;
    }
    }    

