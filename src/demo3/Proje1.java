package demo3;

import java.util.Scanner;

public class Proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is a prime");
        } else {
            System.out.println("Number is not a prime");
        }

    }
}
