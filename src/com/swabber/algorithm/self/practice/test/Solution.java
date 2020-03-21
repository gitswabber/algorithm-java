package com.swabber.algorithm.self.practice.test;

/*
    Find positive number which is not included and smallest in array.
 */
public class Solution {

    public int solution(int[] A) {
        int[] B = new int[1000001];
        int value = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i]] = 1;
            }
        }

        for (int j = 1; j < B.length; j++) {
            if (B[j] == 0) {
                return j;
            }
        }
        return value;
    }
}
