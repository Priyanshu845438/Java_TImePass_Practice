// Day 3 - Week 1
// Int NearestIntegre(int num, int m);
// The function accepts two positive integers 'num' and 'm' as its argument. Implement the function to finf and return a number which satisfies the following conditions:
// 1. Number is divisible by 'm'
// 2. NUmber is nearest to 'num'(Have the least distance from num). DIstance between two numbers is the number of integers between them. 
// input: 67 , m = 8 & output: 64

// Note: If there are two numbers with the least distance from 'num' which is divisible by 'm' then return the largest number/

import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (num): ");
        int num = scanner.nextInt();
        System.out.print("Enter a positive integer (m): ");
        int m = scanner.nextInt();
    }

    public static int nearestInteger(int num, int m) {
        int lower = (num / m) * m; 
        int upper = lower + m;  

        if (Math.abs(num - lower) <= Math.abs(num - upper)) {
            System.out.println(lower);
            return lower; 
        } else {
            System.out.println(upper);
            return upper;
        }
    }
}