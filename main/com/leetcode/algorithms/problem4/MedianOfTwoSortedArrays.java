package com.leetcode.algorithms.problem4;

/**
 * 从两个数组的中间开始，保证左右两边的大小一致。<br>
 * 如果L1>R2，则将数组1移动一个元素到R1，数组2移动一个元素到L2<br>
 * 如果L2>R1，则将数组2移动一个元素到R2，数组1移动一个元素到L1<br>
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N1 = nums1.length;
        int N2 = nums2.length;
        if (N1 < N2) return findMedianSortedArrays(nums2, nums1);    // Make sure A2 is the shorter one.

        int mid2 = N2;
        int mid1 = N1;
        while (true) {
            int L1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];    // Get L1, R1, L2, R2 respectively
            int L2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
            int R1 = (mid1 == N1 * 2) ? Integer.MAX_VALUE : nums1[(mid1) / 2];
            int R2 = (mid2 == N2 * 2) ? Integer.MAX_VALUE : nums2[(mid2) / 2];

            if (L1 > R2) {
                mid2++;
                mid1--;
            }    // A1's lower half is too big; need to move C1 left (C2 right)
            else if (L2 > R1) {
                mid2--;
                mid1++;
            }// A2's lower half too big; need to move C2 left.
            else return (Integer.max(L1, L2) + Integer.min(R1, R2)) / 2.0;    // Otherwise, that's the right cut.
        }
    }

}
