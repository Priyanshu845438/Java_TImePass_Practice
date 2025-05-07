// Day 3 - Week 1
// Write a program to count odd digit numbers from 1 to 110.

public class Program13 {
    public static void main(String[] args) {
        int oddcount = 0;
        int evencount = 0;

        for (int i = 1; i <= 110; i++) {
            int num = i; 
            int digitCount = 0; 

            while (num > 0) { 
                num /= 10; 
                digitCount++; 
            }

            if (digitCount % 2 != 0) { 
                oddcount++;
            } else { 
                evencount++;
            }
        }

        System.out.println("Count of odd digit numbers from 1 to 110: " + oddcount); 
        System.out.println("Count of even digit numbers from 1 to 110: " + evencount); 
    }
    
}
