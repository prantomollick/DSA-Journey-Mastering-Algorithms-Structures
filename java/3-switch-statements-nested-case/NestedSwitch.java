import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Pranto Mollick");
                break;
            case 2:
                System.out.println("Dev Shetty");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Please enter valid EmpID");
        }

        switch (empID) {
            case 1 -> System.out.println("Pranto Mollick");
            case 2 -> System.out.println("Dev Shetty");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Please enter valid EmpID");
        }



    }

}
