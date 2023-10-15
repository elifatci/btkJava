package demo8;

public class Proje6 {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);


        int[] arr1=new int[] {0,2,4};
        int[] arr2=new int[] {1,3,5};
        arr1=arr2;
        arr1[0]=9;
        System.out.println(arr2[0]);
    }
}
