// Day 2 - Week 1 (HW)
// Write a program to find hotel tariff. The room rent is 20% high during season(April - June and november - Decempber)
// Input: The first input integer denotes the count of the month. The second input integer denotes the room rent per day. The third input integer denote the number of days stayed in the hotel.
// Output: Print the hotel triff to be paid (Note: if the month value entered is not ranging from 1 - 12. Print Invalid input)

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();

        System.out.println("Enter the room rent per day:");
        int roomRent = sc.nextInt();

        System.out.println("Enter the number of days stayed in the hotel:");
        int daysStayed = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid input");
        } else {
            double totalCost = roomRent * daysStayed;
            if ((month >= 4 && month <= 6) || (month >= 11 && month <= 12)) {
                totalCost *= 1.2; // Increase by 20%
            }
            System.out.println("Total hotel tariff to be paid: " + totalCost);
        }
    }
    
}
