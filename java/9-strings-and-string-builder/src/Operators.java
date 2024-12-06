import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //operator giving more functionalities, this is called operator overloading..
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a"+ 1);
        //This is same as after a few steps: "a" + "1"
        //integer will be converted to Integer that will call toString()


        System.out.println("Pranto" + new ArrayList<>());
        System.out.println("Pranto" + new Integer(56));

        //only java, operator has applied only primitives and only one operator string
        System.out.println(new Integer(56) + "" + new ArrayList<>());

        //c++ operator overloading is supported

        







    }
}
