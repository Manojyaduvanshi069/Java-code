import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.next(); // it takes the first word of line
        // System.out.println(name);

        // String name = sc.nextLine(); // it takes the whole line
        // System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        sc.close();

    }

}
