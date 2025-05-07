// Day 3 - Week 1
// Print nearest divisible number 

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (num): ");
        int num = scanner.nextInt();
        System.out.print("Enter a positive integer (m): ");
        int m = scanner.nextInt();

        int result = (num / m)* m;
        int large = (result + m);
        
        System.out.println("Nearest small integer to " + num + " that is divisible by " + m + " is: " + result);
        System.out.println("Nearest large integer to " + num + " that is divisible by " + m + " is: " + large);

    }
    
}

