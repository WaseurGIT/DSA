import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {

    public static void merge(int arr[], int st, int mid, int end) {
        List<Integer> temp = new ArrayList<Integer>();

        int i = st;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            arr[k + st] = temp.get(k);
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
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

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}