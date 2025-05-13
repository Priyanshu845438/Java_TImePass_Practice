// Program 32
// Week 1 - Day 6
// Input consists of 2n + 2 integers. The first integer correspond to n1. the size of arrat. The next n1 integre correspond to the elements in the first array. The next (n + 1) integer corresponds to n2. the size of the second array. The last n2 integers correspond to the elements in the second array.
// Output : Compatible array or incompatible array

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array followed by its elements:");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the size of the second array followed by its elements:");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        if (isCompatible(array1, array2)) {
            System.out.println("Compatible");
        } else {
            System.out.println("Incompatible");
        }
    }

    public static boolean isCompatible(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}