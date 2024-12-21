import java.util.Arrays;

public class lcq1 {
    public static void main(String[] args) {
        // que-> https://leetcode.com/problems/missing-number/description/

        int[] nums = { 0,1};
        System.out.println(missingNumber(nums));  //find the missing number in the given array from 0 to N
        System.out.println(Arrays.toString(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        // case 2
        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}