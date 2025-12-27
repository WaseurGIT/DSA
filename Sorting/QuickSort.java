import java.util.Scanner;

public class QuickSort {

    public static int partition(int arr[], int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }

        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;
        return idx;
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivotIdx = partition(arr, start, end);

            quickSort(arr, start, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
