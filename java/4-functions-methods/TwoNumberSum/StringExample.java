package TwoNumberSum;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        int ans = sum3(20, 30);
        System.out.println(ans);


        String personalised = myGreet("Pranto Mollick");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }

    //pass the value of numbers when you ar calling the method in main()
    static  int sum3(int a, int b) {
        return a + b;
    }


    //return the value
    static String greet() {
        String greeting = "How are you!";

        return greeting;
    }

}
