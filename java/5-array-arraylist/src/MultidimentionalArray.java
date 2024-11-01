import jdk.jshell.Snippet;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };

//        System.out.println(Arrays.toString(arr));

        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
