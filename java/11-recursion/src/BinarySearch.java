public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 16;
        int start = 0;
        int end = arr.length - 1;

        int result = search(arr, target, start, end);
        System.out.println("Index: " + result);
    }

    static int search (int[] arr, int target, int start, int end ) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if(target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, 0, mid - 1);
    }
}
