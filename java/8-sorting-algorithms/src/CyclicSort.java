import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int[] arr1 = {4, 3, 5, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    static void sort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correntIdx = arr[i] - 1;

            if (arr[i]  != arr[correntIdx]) {
                swap(arr, i, correntIdx);
            } else {
                i++;
            }

        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
