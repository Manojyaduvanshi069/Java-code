public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quicksrt(int arr[], int low, int high) {
        if (low < high) {
            int pindx = partition(arr, low, high);
            quicksrt(arr, low, pindx - 1);
            quicksrt(arr, pindx + 1, high);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 3, 9, 2, 1 };
        int n = arr.length;

        quicksrt(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
