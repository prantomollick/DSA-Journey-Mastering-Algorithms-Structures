//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1)
                duplicates.add(nums[j]);
        }

        return duplicates;
    }

    static private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}