public class CountSums {
    public static void main(String[] args) {
        int n = 45536;

        int count = 0;

        while (n > 0) {
            int remainder = n % 10;

            if(remainder == 5) {
                count++;
            }

            n /= 10;
        }


        System.out.println(count);




    }


}
