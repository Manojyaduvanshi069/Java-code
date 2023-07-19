import java.util.*;

public class BubbleSort {
    // public static void printArray(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // System.out.println();
    // }

    public static void main(String args[]) {
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

        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

}
