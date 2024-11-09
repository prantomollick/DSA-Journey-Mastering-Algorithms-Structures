public class OrderAgnosticBS {
    public static void main(String[] args) {
        // Test cases for orderAgnosticBS method
        int[] ascArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] descArray = {20, 17, 14, 12, 10, 8, 5, 3, 1};

        // Ascending order tests
        System.out.println(orderAgnosticBS(ascArray, 5)); // Output: 2
        System.out.println(orderAgnosticBS(ascArray, 15)); // Output: 7
        System.out.println(orderAgnosticBS(ascArray, 1)); // Output: 0
        System.out.println(orderAgnosticBS(ascArray, 8)); // Output: -1 (not found)

        // Descending order tests
        System.out.println(orderAgnosticBS(descArray, 14)); // Output: 2
        System.out.println(orderAgnosticBS(descArray, 3)); // Output: 7
        System.out.println(orderAgnosticBS(descArray, 20)); // Output: 0
        System.out.println(orderAgnosticBS(descArray, 21)); // Output: -1 (not found)

    }


    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //Find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return -1;
    }
}
