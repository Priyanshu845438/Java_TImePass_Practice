// Day 1 - Week 1

// Add first and last digit of a four digit number
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your four digit number:");
        int num = sc.nextInt();
        
        if(num<9999){
            int firstDigit = num / 1000;
            int lastDigit = num % 10;
    
            System.out.println(firstDigit + lastDigit);
        } else {
            System.out.println("Invalid number");
        }
    }
} 