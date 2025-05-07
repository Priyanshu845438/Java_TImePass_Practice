// Day 2 - Week 1
// Given an integer 'n'. Perform the following conditional actions:
// 1. If 'n' is odd, print "Weird"
// 2. If 'n' is even and in the inclusive range of 2 to 5, print "Not Weird"   
// 3. If 'n' is even and in the inclusive range of 6 to 20, print "Weird"
// 4. If 'n' is even and greater than 20, print "Not Weird"
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
    
}
