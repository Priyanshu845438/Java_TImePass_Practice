// Day 3 - Week 1
// Write a program to find the sum of digits of a number until the sum become a single digit.

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while(number > 0 || sum > 9){
            if(number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of digits until a single digit is: " + sum);
    }
}