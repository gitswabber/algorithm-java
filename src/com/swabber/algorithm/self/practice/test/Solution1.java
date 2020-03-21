package com.swabber.algorithm.self.practice.test;

/*
    Find season which has biggest gap of tempature using T array.
    The length of T can be changable but must be multiple of 4.
 */
public class Solution1 {
    public String solution(int[] T) {
        String[] seasons = new String[]{"WINTER", "SPRING", "SUMMER", "AUTUMN"};
        int biggestAmplitude = 0;
        int biggestAmplitudeSeasonIndex = 0;

        int days = T.length / 4;
        int arrayIndex = 0;
        int minValue = 1000;
        int maxValue = -1000;

        for (int i = 0; i < T.length; i++) {

            int mod = (i + 1) % days;

            if (T[i] < minValue) {
                minValue = T[i];
            }
            if (T[i] > maxValue) {
                maxValue = T[i];
            }

            if (mod == 0) {
                int amplitude = maxValue - minValue;
                if(biggestAmplitude < amplitude) {
                    biggestAmplitude = amplitude;
                    biggestAmplitudeSeasonIndex = arrayIndex;
                }
                arrayIndex++;
                minValue = 1000;
                maxValue = -1000;
            }
        }
        return seasons[biggestAmplitudeSeasonIndex];
    }
}
