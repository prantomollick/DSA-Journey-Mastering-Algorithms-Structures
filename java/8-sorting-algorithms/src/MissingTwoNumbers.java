//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// Google questions
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MissingTwoNumbers {
    public static void main(String[] args) {
        //int[] nums = {4,3,2,7,8,2,3,1}; //Output: [5,6]
        int[] nums = {10,2,5,10,9,1,1,4,3,7}; //Output: [6,8]


        List<Integer> result =  findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;

        while ( i < n ) {

            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct] ) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1 ) {
                missingNumbers.add(j + 1);
            }
        }
        return missingNumbers;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}