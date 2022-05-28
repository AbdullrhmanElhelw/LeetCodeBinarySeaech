package com.company;

public class Day1 {

    public int findDistanceValue(int[] arr1, int[] arr2, int d) {
        int output = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isfound = false;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d)
                    isfound = true;
            }
            output += isfound ? 0 : 1;
        }
        return output;
    }

    public int guessNumber(int n) {
        int low = 1, high = n, middle = 0;
        while (low < high) {
            middle = (low + high) / 2;
            if (guess(middle) == 0)
                return middle;
            else if (guess(middle) == 1)
                low = middle + 1;
            else
                high = middle - 1;
        }
        return -1;
    }
}
