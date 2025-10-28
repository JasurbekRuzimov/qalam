package for_problems;

import java.util.Scanner;

public class TeskariSon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, sum = 0;

        for (; n != 0; ) {
            a = n % 10;
            sum = sum * 10 + a;
            n = n / 10;
        }
        System.out.printf("%d", sum);
    }
}