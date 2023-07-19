import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the elements to be searched:");
        int s = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                System.out.println("Element found at index " + i);
                break;

            }

        }
        sc.close();

    }

}
