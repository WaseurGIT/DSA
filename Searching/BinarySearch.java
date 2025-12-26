import java.util.Scanner;

public class BinarySearch {

    public static int bs(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements(in ascending order): ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        sc.close();

        int res = bs(arr, key);

        if (res == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found successfully.");
        }
    }
}
