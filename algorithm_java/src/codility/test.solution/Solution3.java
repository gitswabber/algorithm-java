package com.swabber.algorithm.test;

/*
    Get the number of trees which can be cut down as the follow conditions.
    1. All the remaining trees should be sorted in ascending order.
    2. Tree which needs to be cut down is only one.
    3. If the condition can't be satisfied, function should return 0.
 */
public class Solution3 {

    public int solution(int[] A) {
        int cutDownAvailableCount = 0;
        boolean alreadyCounted = false;

        for (int i = 1; i < A.length - 1; i++) {

            int previous = A[i - 1];
            int next = A[i + 1];
            int current = A[i];

            if (previous <= current && current <= next) {

            } else {
                if(alreadyCounted) {
                    break;
                }

                if (previous > current) {
                    cutDownAvailableCount++;
                }
                if(current < next) {
                    cutDownAvailableCount++;
                }

                if (i > 2) {
                    final int prePrevious = A[i - 2];
                    if (prePrevious <= current) {
                        cutDownAvailableCount++;
                    }
                }

                if(cutDownAvailableCount > 0) {
                    alreadyCounted = true;
                }
            }
        }

        return !alreadyCounted ? A.length : cutDownAvailableCount;
    }
}


/*
        int cutDownAvailableCount = 0;
        boolean alreadyCounted = false;

        for (int i = 1; i < A.length; i++) {

            int previous = A[i - 1];
            int next = (A.length <= (i + 1)) ? -1 : A[i + 1];
            int current = A[i];

            if (previous > current) {
                if (alreadyCounted) {
                    return 0;
                }

                if (next < 0) {
                    cutDownAvailableCount++;
                }

                if (previous <= next) {
                    cutDownAvailableCount++;
                    alreadyCounted = true;
                } else if (next > 0) {
                    return 0;
                }

                if (i > 2) {
                    final int prePrevious = A[i - 2];
                    if (prePrevious <= current) {
                        cutDownAvailableCount++;
                        alreadyCounted = true;
                    }
                }

            }
        }

        return !alreadyCounted ? A.length : cutDownAvailableCount;
    }
 */