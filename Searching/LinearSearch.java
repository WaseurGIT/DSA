import java.util.Scanner;

public class LinearSearch {

    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        sc.close();

        int res = ls(arr, key);

        if (res == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found successfully.");
        }
    }
}
