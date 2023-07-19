public class TowerOfHanoi {
    public static void towerOfHanoi_fun(int n, char src, char dest, char helper) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi_fun(n - 1, src, helper, dest);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi_fun(n - 1, helper, dest, src);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi_fun(n, 'A', 'C', 'B');
    }
}
