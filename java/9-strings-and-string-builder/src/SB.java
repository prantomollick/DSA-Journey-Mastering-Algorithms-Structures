//It's not creating new object. it's working only one object and appending the character

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 26; i++) {
            char ch =(char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }
}
