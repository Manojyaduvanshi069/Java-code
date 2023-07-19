import java.util.*;

public class Atumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int lastdgt = n % 10;
            n = n / 10;
            System.out.println(lastdgt);
        }
        System.out.println();
    }
}
