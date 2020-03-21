package com.swabber.algorithm.self.practice.r.test;

import com.swabber.algorithm.codility.etc.GetRectangleArea;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {

/*        int number = 12136;

        Solution solution = new Solution();

        System.out.println(solution.solution(number));*/

        GetRectangleArea getRectangleArea = new GetRectangleArea();
        System.out.println(getRectangleArea.solution(-4, 1, 2, 6, 0, -1, 4, 3));
        System.out.println(getRectangleArea.solution(1,0,2,5,0,1,3,4));
        System.out.println(getRectangleArea.solution(0, 0, 5, 5, 1, 1, 2, 2));
        System.out.println(getRectangleArea.solution(0, 0, 3, 4, 2, 2, 4, 4));

    }

    static class Solution {

        int solution(int n) {
            String numberString = String.valueOf(n);

            char[] numChars = numberString.toCharArray();

            Set<String> result = new HashSet<>();

            //            perm(numChars, 0, numChars.length, numChars.length, result);
            collectPairs(numChars, 0, result);

            return result.size();
        }

        public void collectPairs(char[] numChars, int depth, Set<String> result) {

            if (depth == numChars.length) {
                result.add(new String(numChars));
                return;
            }

            for (int i = depth; i < numChars.length; i++) {
                swap(numChars, i, depth);
                collectPairs(numChars, depth + 1, result);
                swap(numChars, i, depth);
            }

        }

        public void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
