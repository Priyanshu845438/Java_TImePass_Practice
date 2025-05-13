// Program 33
// Week 1 - Day 6
// Array insertion by not removing any existing elements.

import java.util.*;

public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert the element:");
        int position = sc.nextInt();

        System.out.println("Enter the element to be inserted:");
        int element = sc.nextInt();

        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = element;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
