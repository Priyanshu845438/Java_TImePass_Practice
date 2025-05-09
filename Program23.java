// Program 23
// Week 1 - Day 4
// Take input a number from the user and print the pattern as shown below.
// Reverse Print Patern
// Print Patern 
// ****
// ***
// **
// *

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
