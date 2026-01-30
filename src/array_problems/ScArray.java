package array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ScArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Raqamlarni kiriting: ");
        for (int i = 0; i < 5 ; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(Arrays.toString(numbers));
        }



    }
}
