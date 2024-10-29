import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a celsius: ");

        float tempC = input.nextFloat();

        float fahrenheit = (tempC * 9/5) + 32;


        System.out.println("Fahrenheit " + fahrenheit);

    }
}
