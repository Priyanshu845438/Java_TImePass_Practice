// Day 2 - Week 1

// Input ( take 3 input integers):
// 1st Input = Corresponding to the gold treasure
// 2nd Input = Corresponding to the Ben share percentage
// 3rd Input = Corresponding to the Blackbeard share percentage


// Output (2 output integers):
// 1st Output = Corresponding to the Ben share amount
// 2nd Output = Corresponding to the Blackbeard share amount
// Correspond to the other 3 pirates equally divided.

import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Gold treasure amount:");
        int goldTreasure = sc.nextInt();
        
        System.out.println("Ben's share percentage:");
        int benSharePercentage = sc.nextInt();
        
        System.out.println("Blackbeard's share percentage:");
        int blackbeardSharePercentage = sc.nextInt();

        int benShare = (goldTreasure * benSharePercentage) / 100;
        int gold_count = goldTreasure - benShare;
        int blackbeardShare = (gold_count * blackbeardSharePercentage) / 100;
        int remainingGold = gold_count - blackbeardShare;
        int otherPiratesShare = remainingGold / 3;
        
        System.out.println("Ben's share coins: " + benShare);
        System.out.println("Blackbeard's share coins: " + blackbeardShare);
        System.out.println("Each of the other 3 pirates' share coins: " + otherPiratesShare);
    }
    
}
