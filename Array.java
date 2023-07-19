import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int[] marks = new int[3];
        // marks[0] = 98;
        // marks[1] = 97;
        // marks[2] = 96;
        // // System.out.println(marks[1]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        System.out.println("Enter the size:");// linear search
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the elements to be searched:");
        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at index:" + i);
            }
        }
        sc.close();

    }

}
