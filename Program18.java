// Program 18
// Day 4 - Week 1
// Find wheter the given number is adom number or not
// Adom Number: If the number is equal to the reverse of the square of the number
// Foe example: Consider a input 12
// Square(12) == 144
// Reverse(Square(12)) == 441

// STep 1: Find square of number
// Step 2: find reverse of number
// Step 3: Find square of reverse number
// Step 4: find reverse square of reverse number

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
        
        int reverseSquare = reverseNumber(square);
        System.out.println("Reverse of square of " + number + " is: " + reverseSquare);
                
        int squareOfReverse = reverseSquare * reverseSquare;
        System.out.println("Square of reverse of " + number + " is: " + squareOfReverse);
        
        int finalReverse = reverseNumber(squareOfReverse);
        System.out.println("Reverse of square of reverse of " + number + " is: " + finalReverse);
        
        if (number == finalReverse) {
            System.out.println(number + " is an Adom number.");
        } else {
            System.out.println(number + " is not an Adom number.");
        }
    }
    
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
