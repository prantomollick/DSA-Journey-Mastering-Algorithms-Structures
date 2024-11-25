import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {8, 5, 2, 9, 5, 6, 3, 0};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        bubble(arr);
        System.out.println(Arrays.toString(arr));

        bubble(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubble(int[] arr) {
        //run the steps n - 1 times
        boolean isSwapped = false;

        for (int i = 0; i < arr.length ; i++) {
            // For each step, max item will come at the last respective index

            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller the previous item

                if ( arr[j] < arr[j - 1]) {
                    isSwapped = true;
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }

            // If you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!isSwapped) break;
        }

    }
}