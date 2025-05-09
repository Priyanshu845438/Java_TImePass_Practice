// Program 21
// Week 1 - Day 4
// A number can be said as a stong number when the sum of the factorial of the individual digits of the number is equal to the number itself. For example, 145 is a strong number since 1! + 4! + 5! = 145. Similarly, 40585 is a strong number since 4! + 0! + 5! + 8! + 5! = 40585.

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
}
