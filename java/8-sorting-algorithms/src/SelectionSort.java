import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3, 0};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(selection(arr)));

    }


    static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

        return arr;
    }

    static private int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }


    static private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
