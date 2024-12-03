//https://leetcode.com/problems/set-mismatch/description/

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] != nums[correctIdx] ) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }

        //Search the missing number
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
                return new int[] {nums[j], j + 1 };
            }
        }

        return new int[] {-1, -1};
    }


    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}