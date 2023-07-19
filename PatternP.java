public class PatternP {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(count++);
            }
            System.out.println();
            for (int j = i; j <= 4 * n; j++) {
                System.out.print(count++);
            }
        }
    }
}
