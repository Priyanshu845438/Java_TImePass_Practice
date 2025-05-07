// Day 1 - Week 1

// Program to determine the department based on seat number in a classroom arrangement
// The classroom is arranged in a grid format with 'row' rows and 'col' columns 
// The first and last columns are for CSE students, while the middle columns are for ECE students
// The program takes the number of rows, columns, and a seat number as input and outputs the department

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        System.out.print("Enter seat number: ");
        int seat_no = sc.nextInt();

        if (seat_no <= col || seat_no % col == 0 || seat_no % col == 1) {
            System.out.println("CSE");
        } else {
            System.out.println("ECE");
        }

        sc.close();
    }
}
