package demo5;

import java.util.Arrays;
import java.util.Scanner;

public class Proje3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int number = scanner.nextInt();
        int total = 0;


        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                int[] arr = {i};
                total += i;
                System.out.print(Arrays.toString(arr));
            }

        }
        if (total == number) {
            System.out.println("Perfect number");
        } else {
            System.out.println("The number is not perfect number");
        }
    }
}
