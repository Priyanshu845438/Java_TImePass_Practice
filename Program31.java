// Program 31
// Week 1 - Day 5
// Note: Two arrays are said to be the same if the sum of both arrays os the same and the size of the array is the same
// Input: Input consist of 2 integers and 2 array. The integer should corrospend to the size of the array

// Output: 
//4
//4
//1
//2
//3
//4
//1
//2
//3
//4

import java.util.*;
public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        if (n1 == n2) {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < n1; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            
            if (sum1 == sum2) {
                System.out.println("The two arrays are the same.");
            } else {
                System.out.println("The two arrays are not the same.");
            }
        } else {
            System.out.println("The two arrays are not the same.");
        }
    }
    
}
