// Program 24 
// Week 1 - Day 5
// Staircase pattern
//    *
//   **
//  ***
// *****


import java.util.Scanner;
public class Program24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}