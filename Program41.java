// Program 40
// Week 2 - Day 2
// Input Specification:
// input1: An integer value n representing the number of individuals.
// input2: An integer array of size 2 * n representing the height and weight of each individual.
// The first value of each pair corresponds to height.
// The second value of each pair corresponds to weight.

// Output Specification:
// Return a string containing two integers separated by a space:
// The 1-based index of the individual with the maximum height.
// The 1-based index of the individual with the maximum weight.

import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }

        int maxHeight = heights[0];
        int maxWeight = weights[0];
        int maxHeightIndex = 1; 
        int maxWeightIndex = 1;

        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxHeightIndex = i + 1;
            }
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxWeightIndex = i + 1;
            }
        }

        System.out.println(maxHeightIndex + " " + maxWeightIndex);
    }
}