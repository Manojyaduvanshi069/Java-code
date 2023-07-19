public class PatternP1 {
    public static void main(String[] args) {
        int n = 4;
        int count = n + 2;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(count + "*");
            }
            count--;
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(count + 1 + "*");
            }
            count++;
            System.out.println();
        }
    }
}
