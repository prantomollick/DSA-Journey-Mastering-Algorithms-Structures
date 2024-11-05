import algorithms.sorting.MergeSort2;

public class Main {
    public static void main(String[] args ) {
       
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        MergeSort2 obj = new MergeSort2();
        // MergeSort2 mergeSort = new MergeSort2();

        MergeSort2.divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        


    }

}

