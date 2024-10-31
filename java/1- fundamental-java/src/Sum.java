import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum = "  + sum);

//        int num = (int) (64.56f);
//        System.out.println(num);
//
        //automatic type promotion in expressions
//        int a = 250;
//
//        byte b = (byte) a; // 257 % 256 = 1
//
//        System.out.println(b);
//
//        byte c = 50;
//        byte d = 50;
//        byte e = 100;
//
//        int f = (c * d) / e;
//
//        System.out.println(f);

        //You can not do that expression evaluation because integer expression cann't convert automatically byte expression because of byte is out of the range
//        byte b = 50;
//        b = b * 2;

        int number = 'A';// java working on unicode values also, you can print any language character on java.
        System.out.println(number);


        //type promotion rules, byte and short values are promoted to integers
        // interger  * float give me double,



        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        //float  + int  - doble = double // automatically type expression when expression will evaluated
        System.out.println((f * b) + " " +  (i / c) +  " " + - (d - s));
        System.out.println(result);

    }
}
