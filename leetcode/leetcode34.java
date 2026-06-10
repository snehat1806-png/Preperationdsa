//https://leetcode.com/problems/valid-perfect-square/
public class leetcode34 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long low = 1;
        long high = num / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}