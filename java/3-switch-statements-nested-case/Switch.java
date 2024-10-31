import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();

//        if ( fruit.equals("mango") ) {
//            System.out.println("King of fruit");
//        }
//
//        if ( fruit.equals("apple") ) {
//            System.out.println(" a sweet red fruit ");
//        }

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("A sweet red fruit!");
//            case "orange" -> System.out.println("Round Fruit");
//            case "grapes" -> System.out.println("Smalle fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }


        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//
        switch (day) {
            case 1, 2, 3 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


    }

}
