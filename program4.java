// Day 2 - Week 1
// Write a program to reverse 3 digit number
import java.util.Scanner;

public class program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num <1000 & num > 99){

            int hundrads = num / 100;
            int tens = num % 100 / 10;
            int ones = num % 10;

            int reverse = ones * 100 + tens * 10 + hundrads;

            System.out.println(reverse);
        }
    }

}
