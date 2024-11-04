public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedNumbers = {-12, -4, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(sortedNumbers, 5));

    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start  + (end - start) / 2; //might be possible that (start + end) exceeds the memory space

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
