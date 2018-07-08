package com.app;

public class Solution {

    // Not perfect, but works :)
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0; 
        int previousCarsHeadingEast = 0;
        boolean sawCarHeadingEast = false;
        for (int car : A) {
            if (car == 0) {
                previousCarsHeadingEast++;
            }
            if (sawCarHeadingEast) {
                if (car == 1) {
                    result += (previousCarsHeadingEast);
                    if (result > 1_000_000_000) {
                        return -1;
                    }
                }
            } else {
                if (car == 0) {
                    sawCarHeadingEast = true;
                }
            }
        }
        return result;
    }
}
