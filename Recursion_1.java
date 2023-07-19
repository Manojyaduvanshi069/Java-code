import java.util.*;

public class Recursion_1 {
    // public static void printNum(int n) { // (1) printing 5 to 1;
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // printNum(n - 1);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = 7;
    // printNum(n);
    // }

    // (2) printing sum of first n natural numbers;
    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum = sum + i;
    // System.out.println(sum);
    // return;
    // }
    // sum = sum + i;
    // printSum(i + 1, n, sum);
    // }

    // public static void main(String[] args) {
    // printSum(1, 5, 0);
    // }

    // (3) Factorial of n;

    // public static int calcFact(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }
    // int fact_nm1 = calcFact(n - 1);
    // int fact_n = n * fact_nm1;
    // return fact_n;
    // }

    // public static void main(String[] args) {
    // int factorial = calcFact(5);
    // System.out.println(factorial);
    // }

    // (4) Printing Fibonacci series;

    // public static void printFib(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFib(b, c, n - 1);
    // }

    // public static void main(String[] args) {
    // int a = 0, b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 8;
    // printFib(a, b, n - 2);

    // }

    // (5) calculation of power of a number; (hieght = n)

    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int power1 = calcPower(x, n - 1);
    // int power = x * power1;
    // return power;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = 2, n = 5;
    // int res = calcPower(x, n);
    // System.out.println(res);

    // }

    // (6) calculation of power of a number; (hieght = log n)

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2, n = 5;
        int res = calcPower(x, n);
        System.out.println(res);

        sc.close();

    }

}
