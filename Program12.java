// Day 3 - Week 1
// Sum even and odd digits from an integers & Count all digits.

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        
        int sumEven = 0;
        int sumOdd = 0;
        int count = 0;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sumEven += digit; 
            } else {
                sumOdd += digit; 
            }
            n /= 10;
            count++;
        }
        
        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
        System.out.println("Count of digits: " + count);
    }
    
}
