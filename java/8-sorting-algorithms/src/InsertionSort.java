import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3, 0};
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {4, 1, 3, 9, 7};


        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));


    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j- 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
