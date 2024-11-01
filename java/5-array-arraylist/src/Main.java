public class Main {
    public static void main(String[] args) {
        //Q: store a roll number;
        int a = 19;

        //Q: store a person's name
        String name = "pranto Mollick";

        // Q: store 5 roll numbers;

        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers;
//        int[] rollNumbers = new int[5];

        //or directly all type of data array should be the same.
//        int[] rollNumbers2 = {23, 12, 45, 32, 15};

        int[] ros; //declaration of array. ros is getting defined in the stack;
        ros = new int[5]; //initialisation: actually here object is being created in the memory (heap) at the runtime memory will allocate this is called run time allocation

        // `new` is used to create a object in the heap memory
        //any reference variable have by default it's run type


//        System.out.println(ros[1]);

        String[] arr = new String[4];

        System.out.println(arr[2]);




    }
}