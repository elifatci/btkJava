package demo4;

import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a vowel");
        char vowel = scanner.next().toLowerCase().charAt(0);

        switch (vowel) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Bold vowel");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Thin vowel");
                break;
            default:

        }
    }
}

