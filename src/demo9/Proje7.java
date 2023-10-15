package demo9;

import java.util.Scanner;

public class Proje7 {
    public int plus(int... number1) {
        int total = 0;
        for (int num : number1) {
            total += num;
        }
        return total;
    }

    public int minus(int... number1) {
        int subtraction = number1[0];
        for (int i = 1; i < number1.length; i++) {
            subtraction -= number1[i];
        }

        return subtraction;

    }


    public double divide(int... number1) {
        double result = number1[0];
        for (int i = 1; i < number1.length; i++) {
            if (number1[i] != 0) {
                result /= number1[i];
            } else {
                System.out.println("error");
            }
        }
        return result;
    }

    public int times(int... number1) {
        int result = 1;
        for (int each : number1) {
            result *= each;

        }
        return result;
    }


}
