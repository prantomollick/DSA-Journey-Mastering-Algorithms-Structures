public class Comparison {
    public static void main(String[] args) {
//        String a = "Pranto";
//        String b = "Pranto";
//
//        // ==
//        System.out.println(a == b);
//        System.out.println(a.equals(b));


        //There are two ways you compare
        // == comparator method
        // If a is pointing to Pranto
        // If b is pointing to Pranto
        // a== b  true
        //Check the reference variable pointing to the same object
        //This means it's create string pool and pointing to same variable
        //What string it will be the two objects
        //How to create till object of same value in string
        String a = new String("Pranto");
        String b = new String("Pranto");
        //it's actually creating these values outside the pool but in heap.
        //a == b //return false because this is different object
        // 2) When you only need to check value use equals method.

        //This is not the way to creat string. Try to use string pool
        String name = new String("Pranto");
        String name2 = new String("Pranto");

        //System.out.println(name == name2);

        // This is not care about reference variable it's care about the value.
        // System.out.println(name.equals(name2));
        System.out.println(name.charAt(-1));





    }
}
