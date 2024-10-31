package TwoNumberSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q: take input of 2 numbers and print the sum

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Please enter num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
