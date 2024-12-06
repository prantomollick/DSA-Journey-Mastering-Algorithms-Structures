import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Pranto Mollick";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // it's creating new object
        System.out.println(name);
        System.out.println(name.indexOf('a')); // print of this character index
        System.out.println("        Pranto     ".strip());
        System.out.println(Arrays.toString(name.split(" "))); //Split based on this regex expression


    }

}
