//https://leetcode.com/problems/first-missing-positive/

class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else  {
                i++;
            }
        }

        //Search for first missing number
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx + 1) {
                return idx + 1;
            }
        }

        //case 1
        return nums.length + 1;

    }

    static private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}