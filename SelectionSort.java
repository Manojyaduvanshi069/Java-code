import java.util.*;

public class SelectionSort {
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
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println();

        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
