// Day 2 - Week 1
//Input: The input is an integer 'n' which denotes the given number
// Output: If the given number is trendy number. then print 'Trendy Number'. Otherwise print "Not Trendy Number". if the given number is not a 3 digit number. then print "Invalid number".
// Instruction: A number is said to be a trendy number if it has 3 digits and the middle digit is divisible by 3

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Invalid number");
        } else {
            int middleDigit = (num / 10) % 10;

            if (middleDigit % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not Trendy Number");
            }
        }
    }
    
}