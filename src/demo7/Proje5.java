package demo7;

import java.util.Arrays;

public class Proje5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 6, 7, 9, 2, 8};
        int findNumber = 8;
        boolean isThere;

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, findNumber));

        for (int each : numbers) {
            if (each == findNumber) {
                isThere = true;
            }
        }
        if (isThere = true) {
            System.out.println("The numbers are contain find number");
        } else {
            System.out.println("The numbers are not contain find number");
        }

    }
}

