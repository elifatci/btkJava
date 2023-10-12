package demo2;

public class recapDemo2 {
    public static void main(String[] args) {

        int[] myList = {2, 5, 6, 9, 13};

        int total = 0;
        int max = myList[0];


        for (int number : myList) {
            System.out.println(number);
            total += number;

        }
        System.out.println("Toplam: " + total);

        for (int list : myList) {
            if (max < list) {
                max = list;

            }

        }
        System.out.println("Number of max: " + max);

    }


}
