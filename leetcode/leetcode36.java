public class leetcode36 {
    // https://leetcode.com/problems/first-bad-version/description/
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }

    static int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean isBadVersion(int version) {
        return version >= 4;
    }
}