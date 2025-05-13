// Progran 43
// week 3 Day 2
// Input format:
// - The first line of the input consist of an integer - numContainers, representing the number of container (N)
// - The next line consists of N space seperated integers - cont1, cont2, ... contN, reprensting container capacity.

// Consistaints
// - 1<=numContainers<=1000
// - 1<=cont1 <=1000
// - 1<=cont2 <=1000

// Sample Input:
// 6
// 199 568 23 29 53 29

// sample Output:
// 568 29
// 199 28
// 53 23


import java.util.*;
public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numContainers = sc.nextInt();
        int[] containers = new int[numContainers];

        for (int i = 0; i < numContainers; i++) {
            containers[i] = sc.nextInt();
        }

        for (int i = 0; i < numContainers; i++) {
            for (int j = i + 1; j < numContainers; j++) {
                if (containers[i] > containers[j]) {
                    System.out.println(containers[i] + " " + containers[j]);
                }
            }
        }
    }
}