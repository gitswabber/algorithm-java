package com.swabber.algorithm.test;

/*
    Make string as much as the count of A and B.
    But the maximum continuous count of the same character is 2.
 */
public class Solution2 {

    public String solution(int A, int B) {
        String result = "";
        if (A == B) {
            for (int i = 0; i < A; i++) {
                result += "ab";
            }
            return result;
        }

        int bigNumber, smallNumber;
        String bigNumberValue, smallNumberValue;

        if (A > B) {
            bigNumber = A;
            smallNumber = B;
            bigNumberValue = "a";
            smallNumberValue = "b";
        } else {
            bigNumber = B;
            smallNumber = A;
            bigNumberValue = "b";
            smallNumberValue = "a";
        }

        boolean outputTwice = bigNumber - (smallNumber * 2) >= 0;
        for (int i = 0; i < smallNumber; i++) {
            if (outputTwice) {
                result += (bigNumberValue + bigNumberValue);
            } else {
                result += (bigNumberValue);
            }
            result += (smallNumberValue);
        }

        int rest = bigNumber - (smallNumber * 2);
        int restRepeat = 0;
        if (rest < 0) {
            restRepeat = bigNumber - smallNumber;
        }
        if(rest > 0) {
            restRepeat = rest;
        }

        for (int j = 0; j < restRepeat; j++) {
            result += (bigNumberValue);
        }
        return result;
    }
}
