public class leetcode35 {
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/   
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Return 1-based indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Return -1 if no solution is found
    }
}
