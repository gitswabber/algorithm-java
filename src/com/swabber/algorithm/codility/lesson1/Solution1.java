package com.swabber.algorithm.codility.lesson1;

/**
 * https://codility.com/programmers/lessons/1-iterations/
 */
public class Solution1 {
    public int solution(int N) {
        return getMaximumZeroLength( getBinaryGapStr(N) );
    }

    private String getBinaryGapStr(int n) {
        String s = "";
        while(n > 0) {
            int mod = n%2;
            s += String.valueOf(mod);
            n = n/2;
        }
        return s;
    }

    private int getMaximumZeroLength(String binaryGapStr) {
        int length=0, maximumZeroLength=0;
        boolean surrounded=true;
        // the value of last index must be 1
        for(int i=binaryGapStr.length()-2; i >= 0 ; i--) {
            int binaryNumber = binaryGapStr.charAt(i) - '0';

            if( binaryNumber == 0 ) {
                length++;
                if( (binaryGapStr.charAt(i+1) - '0') == 1 ) {
                    surrounded = true;
                }
            } else {
                if( length >= maximumZeroLength && surrounded ) {
                    maximumZeroLength = length;
                    surrounded = false;
                }
                length = 0;
            }
        }
        return maximumZeroLength;
    }
}
