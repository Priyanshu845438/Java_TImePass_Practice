// Program 42
// Week 2 - Day 2
// Input: the first line input consist of an integer num, representing the size of lint(N). The second line of tje input consists of N space seperated integres representing the value of the list.
// Output: Print N space seperated integers such that all the odd numbers of the list comes after the even numbers.
// Samople input: 8
// 19 98 3 33 12 22 21 22

// Sample output: 98 12 22 22 19 3 33 21

import java.util.Scanner;
public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}