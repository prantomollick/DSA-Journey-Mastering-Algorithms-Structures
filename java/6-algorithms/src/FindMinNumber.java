public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    static int min( int[] arr) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }
}
