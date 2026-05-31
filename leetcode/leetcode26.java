public class leetcode26{
//https://leetcode.com/problems/plus-one/submissions/2016837100/
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] res = plusOne(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
    
}
