// Program 20
// Week 1 - Day 4
// Consider an n digit number k. square it and add the right n digits to the left n  and n-1 digits. if the resultant sum is k then k is called a kaprekar number.
// For example , 9 is a kaprekar number since 9^2 = 81 and 8+1 = 9. Similarly, 297 is a kaprekar number since 297^2 = 88209 and 88+209 = 297.
// Input Format: input consist of a single integer.


import java.util.*;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int sq = num * num;
        int temp = num;
        while(num !=0){
            num /= 10;
            count++;
        }
        int power = (int)Math.pow(10, count);
        int right = sq % power;
        int left = sq / power;
        int sum = left + right;
        if(sum == temp){
            System.out.println(temp + " is a Kaprekar number.");
        }else{
            System.out.println(temp + " is not a Kaprekar number.");
        }
    }
}
