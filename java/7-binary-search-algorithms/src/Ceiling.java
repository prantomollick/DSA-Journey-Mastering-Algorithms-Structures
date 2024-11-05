public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 9, 10};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(ceiling(arr, 7));
    }

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {
        // But what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return start;
    }

}
