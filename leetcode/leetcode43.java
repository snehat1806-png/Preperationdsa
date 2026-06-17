import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class leetcode43 {

    public static void main(String[] args) {

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

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

                if (result.isEmpty() ||
                    result.get(result.size() - 1) != nums1[i]) {

                    result.add(nums1[i]);
                }

                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        int[] resultArray = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        return resultArray;
    }
}