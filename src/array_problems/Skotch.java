package array_problems;

import java.util.Scanner;

public class Skotch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bugungi sanani kiriting: ");
        int x = scanner.nextInt();
        int[] pichoq = {1, 3, 6, 2, 29, 21, 16, 31, 13, 22, 19, 10, 9, 11, 17, 5};
        int summ = 0;
        for (int i = 0; i < pichoq.length; i++) {
            if (x >= pichoq[i]) {
                System.out.println(i + "-indexdagi sanada " + pichoq[i] + " ta pichoq yasalgan");
                summ += pichoq[i];
            }
        }
        System.out.println("\nJami: " + x + " kun mobaynida "+ summ + " ta pichoq yasalgan");
    }
}