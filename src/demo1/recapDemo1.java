package demo1;

public class recapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        System.out.println(sayi2 > sayi1 && sayi2 > sayi3 ? "Buyuk sayi " : " ");

        if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("Buyuk sayi : " + sayi2);
        } else if (sayi1 > sayi3 && sayi1 < sayi2) {
            System.out.println("Ortanca sayi : " + sayi1);
        } else {
            System.out.println("Kucuk sayi : " + sayi3);
        }
    }
}
