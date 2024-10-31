package TwoNumberSum;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 65);
        multiple(2, 4,"Kunal", "Rahul", "Dyytsbhusc");
    }

    static void multiple(int a, int b, String ...v) {

    }


    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }


}
