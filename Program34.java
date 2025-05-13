// Program 34
// Week 1 - Day 6
// Write a program to remove all the duplicate elements from an array.

import java.util.*;

public class Program34 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }

        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
