package com.codecool;

public class Challenge {
    public static int minPositive(int a, int b) {
        int result = 0;
        if (a > 0 && b > 0) {
            if (a < b) {
                result = a;
            } else result = b;
            } else if (a > 0 && b <= 0) {
            result = a;
        } else if (b > 0 && a <= 0) {
            result = b;
        }
        else result = -1;

        return result;
    }
}
