// Program 40
// Week 2 - Day 1
// The first line contain two integers n and m(1<=n, m <=100). 
// output format: Print a single string - the number of buses needed to transport all n group to the jeju Island contaryside
// Input: 4 4 
// 3 3 3 3 

// output: 4


import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = sc.nextInt();
        }

        int busCount = 0;
        int currentBusLoad = 0;

        for (int i = 0; i < n; i++) {

            if (currentBusLoad + groups[i] > m) {
                busCount++;
                currentBusLoad = 0;
            }
            currentBusLoad += groups[i];
        }

        if (currentBusLoad > 0) {
            busCount++;
        }

        System.out.println(busCount);
    }
}
