//https://leetcode.com/problems/missing-number/
//Amazon Question

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums1)); // Output: 2

        // Test Case 2
        int[] nums2 = {0, 1};
        missingNumber(nums2);
        System.out.println("Missing number: " + missingNumber(nums2)); // Output: 2

        // Test Case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums3)); // Output: 8

        // Test Case 4: Edge case - single element
        int[] nums4 = {0};

        System.out.println("Missing number: " + missingNumber(nums4)); // Output: 10

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {

            if (nums[i] < n && nums[i] != i) {
                swap(nums, nums[i], i);
            } else {
                i++;
            }

        }

        // Search for first missing number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return n;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}


