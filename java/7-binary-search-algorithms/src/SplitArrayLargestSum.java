//https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }


    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            //in the end of the loop this loop this will contain the max item from the array //simple linear search
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //Binary Search
        while (start < end) {
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subArray, make new one
                    //say you add this num in new subarray, then sum = num;
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if( pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end;
    }

}
