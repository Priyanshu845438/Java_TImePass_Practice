// Program 22
// Week 1 - Day 4
// Take input a number from the user and print the pattern as shown below.
// Print Patern 
//*
//**
//***
//****

import java.util.Scanner;
public class Program22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
