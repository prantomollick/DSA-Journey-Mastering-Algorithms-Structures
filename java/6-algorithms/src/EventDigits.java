public class EventDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
        int countDigit = findNumbers(nums);
        System.out.println(countDigit);
        System.out.println(findNumbers2(nums));


    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }


    static int findNumbers2(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(digits2(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    // function to check whether a number contains even digits or not
    static boolean even(int num) {

        if (num < 0) {
            num *= -1;
        }

        if(num == 0) {
            return false;
        }

        int countDigits = 0;
        while (num > 0) {
            countDigits++;
            num /= 10;
        }
        return countDigits % 2 == 0;
    }

    static int digits2 (int num) {
        if (num < 0) {
            num *= -1;
        }

        if(num == 0) {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
