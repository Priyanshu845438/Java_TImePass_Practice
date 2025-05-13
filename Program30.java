// Program 30
// Week 1 - Day 5
// Subtract of all the elements in the array
// imput: 1-2-3-4-5
// Output: -13

import java.util.*;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int subtract = arr[0]; 
        for (int i = 1; i < n; i++) {
            subtract -= arr[i];
        }

        System.out.println("The subtract of all the elements in the array is: " + subtract);
    }
}

