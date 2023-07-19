import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}