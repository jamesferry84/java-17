package com.jrferry.datastructures.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 * <p>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
        exampleFour();
    }

    private static void exampleOne() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }

    private static void exampleTwo() {

        int[] nums1 = {1};
        int[] nums2 = {0};
        int m = 1;
        int n = 0;
        merge(nums1,m,nums2,n);
    }

    private static void exampleThree() {

        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1,m,nums2,n);
    }

    private static void exampleFour() {

        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] newArray = new int[m+n];
        //optimisations
        if (nums1[m] < nums2[0]) {
            
        }


        System.out.println("Before:");
        System.out.println(Arrays.toString(nums1));
        for (int i = 0, j = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            if (n == 0 || j >= nums2.length) return nums1;

            if (nums1[i] == 0) {
                nums1[i] = nums2[j];
                j++;
                continue;
            }
            if (nums2[j] < nums1[i]) {
                nums1[i] = nums2[j];
                nums2[j] = temp;
                if (j != n -1) {
                    if (nums2[j] > nums2[j+1]) {
                        temp = nums2[j];
                        nums2[j] = nums2[j+1];
                        nums2[j+1] = temp;
                    }
                }
            }
        }

        System.out.println("After:");
        System.out.println(Arrays.toString(nums1));

        return nums1;
    }
}
