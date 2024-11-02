public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        //Search for 3 in the range of index [1, 4]

        int target = 301;
        System.out.println(linearSearch(arr, target, 1, 4));


    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) return Integer.MAX_VALUE;

        //run a for loop through iterate the array

        for ( int index = start; index <= end; index++) {

            if(arr[index] == target) {
                return index;
            }
        }


        return Integer.MAX_VALUE;
    }


}
