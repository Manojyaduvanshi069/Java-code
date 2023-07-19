import java.util.*;

// 1 function
// public class Functions {
// public static void printMyName(String name) {
// System.out.println(name);
// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.next();

// printMyName(name); // function call

// }

// }

// 2 fuction
// public class Functions {
// public static int calculateSum(int a, int b) {
// int sum = a + b;
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = calculateSum(a, b);

// System.out.println("sum of the two number is :" + sum);

// }
// }

// 3 function
// public class Functions {
// public static int calculateMul(int a, int b) {
// int mul = a * b;
// return mul;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int mul = calculateMul(a, b);

// System.out.println("multiply of two number is:" + mul);

// }
// }

public class Functions {
    public static void printFactorial(int n) {
        int factorial = 1;

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

        sc.close();
    }
}