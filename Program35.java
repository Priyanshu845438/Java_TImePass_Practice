// Program 35
// Week 1 - Day 6
// Cubic Sum: Given function: 
//Int isCubicSumExist(long long int A[], int N);
// The function accept an array A of size N implement the function to return the count of good integers in array A. An integer Z is said to be good if and only if there exist two integers x and y such that x3 + y3 = Z.
// Input: N:3, A:[35,9,1]
// Output: 2
// Explanation: 35 is a good integre, there exist an answer with X = 2, y = 3(23 + 33 = 8 + 27 = 35)

import java.util.*;

public class Program35 {
    public static int isCubicSumExist(int[] A, int N) {
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            int z = A[i];
            int x = 0;
            int y = (int) Math.cbrt(z); 
            
            while (x <= y) {
                int sum = (int) (Math.pow(x, 3) + Math.pow(y, 3));
                
                if (sum == z) {
                    count++; 
                    break;
                } else if (sum < z) {
                    x++; 
                } else {
                    y--; 
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = isCubicSumExist(arr, n);

        System.out.println("Count of good integers: " + result);
    }
}