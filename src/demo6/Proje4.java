package demo6;

import java.util.Scanner;

public class Proje4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive integer");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int total1 = 0;
        int total2 = 0;


        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 += j;
            }
        }

        if (number1 == total2 && number2 == total1) {
            System.out.println(number1 + " and " + number2 + " amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " is not amicable numbers");
        }

    }
}
