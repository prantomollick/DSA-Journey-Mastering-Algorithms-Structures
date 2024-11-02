public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 16;

        System.out.println(linearSearch(nums, target));

        if(isElementArrayExists(nums, target)) {
            System.out.println("worked!");
        }


    }

    //Search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }

        //This line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    //Search the target and return true or false;

    static boolean isElementArrayExists(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for (int el : arr) {
            if(el == target) return true;
        }

        //This line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

}