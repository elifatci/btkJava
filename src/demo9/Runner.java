package demo9;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter");
        int numbers = scanner.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.print("number" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }


        Proje7 fourOperations = new Proje7();

        System.out.println(fourOperations.plus(arr));
        System.out.println(fourOperations.minus(arr));
        System.out.println(fourOperations.divide(arr));
        System.out.println(fourOperations.times(arr));

    }
}
