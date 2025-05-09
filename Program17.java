// Program 17
// Day 4 - Week 1
//Find wether the given number is Harsad number
// Harshad Number: If the number is divisible by sum of digit of the number

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }    
}
