import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println(a);
        System.out.println(b);
        while (count <= n) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count++;
        }

    }


}
