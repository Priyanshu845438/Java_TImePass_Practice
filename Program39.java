// 88. Merge Sorted Array
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

// Constraints:

// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[j] <= 109
 

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

import java.util.*;

public class Program39 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the first array:");
        int m = sc.nextInt();
        int[] nums1 = new int[m + 200]; 
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter size of the second array:");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    
}

// approch explanation
// 1. Initialize three pointers: i for the last element of nums1, j for the last element of nums2, and k for the last position in nums1.
// 2. Compare the elements pointed to by i and j. Place the larger element at position k in nums1 and move the respective pointer (i or j) and k backward.
// 3. If there are remaining elements in nums2 after nums1 is exhausted, copy them to nums1.
// 4. The merged array is now in nums1, and the function does not return anything as the result is stored in nums1.
// 5. The time complexity of this approach is O(m + n), where m and n are the sizes of nums1 and nums2, respectively. The space complexity is O(1) since we are modifying nums1 in place.
// 6. This approach is efficient and meets the problem's requirements.
// 7. The merged array is sorted in non-decreasing order as both input arrays are already sorted.
// 8. The function handles edge cases, such as when one of the arrays is empty or when all elements in nums2 are smaller than those in nums1.
// 9. The final merged array is printed in the main method after calling the merge function.
// 10. The program uses a Scanner to read input from the user for both arrays and their sizes.
// 11. The merged array is printed in the main method after calling the merge function.