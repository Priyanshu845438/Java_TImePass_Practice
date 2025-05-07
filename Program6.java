// Day 2 - Week 1
// Print a 2 digit number from user and check wether the number is less then 20. then print less then 20. if it is greater then 20 print odd and even.

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two-digit number:");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Invalid input. Please enter a two-digit number.");
        } else {
            if (num < 20) {
                System.out.println("Less than 20");
            } else {
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        }
    }
}
