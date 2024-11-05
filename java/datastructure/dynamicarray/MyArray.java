package datastructure.dynamicarray;

import java.util.Arrays;

public class MyArray {
    private int[] items;
    private int currentIdx;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIdx = 0;
    }   

    public void insert(int value) {
        if (currentIdx == items.length) {
            // If the array is full, double its size and copy the old elements to the new array
            int[] temp = new int[items.length * 2 ];
            for (int i = 0; i < items.length; i++) {
                temp[i] = this.items[i];
            }
            this.items = temp;
        }


        this.items[currentIdx] = value;
        currentIdx++;
    }

    public int indexOf(int value) {
        for (int i = 0; i < currentIdx; i++) {
            if (items[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void removeAt(int idx) {
        if(idx >=  currentIdx) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for(int i = idx; i < currentIdx; i++) {
            items[i] = items[i + 1];
        }
        currentIdx--;
    }

    public int max() {
        if(currentIdx == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }

        int max = this.items[0]; 

        for (int i = 0; i < currentIdx; i++) {
            if(items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }

    public int min() {
        if(currentIdx == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }

        int min = items[0];

        for (int i = 0; i < currentIdx; i++) {
            if(items[i] < min) {
                min = items[i];
            }
        }

        return min;
    }

    public void reverse() {
        int left = 0;
        int right = currentIdx - 1;
        while(left < right) {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
            left++;
            right--;
        }
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < currentIdx; i++) {
            str.append(items[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    

}
