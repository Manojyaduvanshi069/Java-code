import java.util.*;

public class Stringss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Manoj is a good boy");
        System.out.println(sb);

        // // char at index

        // System.out.println(sb.charAt(1));

        // // set char at index

        // sb.setCharAt(1, 'o');
        // System.out.println(sb);

        // // insert

        // sb.insert(1, 'o');
        // System.out.println(sb);

        // // delete

        // sb.delete(1, 2);
        // System.out.println(sb);

        // palindrome
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            // System.out.println(sb);

        }
        System.out.println(sb);
        sc.close();
    }

}
