package TwoNumberSum;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name = "Pranto";

        {
           // int a = 78; //already initialised outside the block in the same method, hence you cannot initialize again
            a = 100;
            System.out.println(a);
            int c = 99;
            //values initialised in this block, will remain in block
            name = "Mollick";
            System.out.println(name);


        }

//        System.out.println(marks);
        //Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int sum = 90;
            System.out.println(sum);
//            int a = 10;
        }
//        System.out.println(i);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
