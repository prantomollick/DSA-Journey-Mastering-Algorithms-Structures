package algorithms.sorting;

public class MergeSort2 {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        
        int idx1 = si;
        int idx2 = mid + 1;
        int k = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merge[k++] = arr[idx1++];
            } else {
                merge[k++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[k++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merge[k++] = arr[idx2++];
        }

        for(int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }


    public static void divide(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

}
