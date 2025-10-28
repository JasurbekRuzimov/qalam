package for_problems;

import java.util.Scanner;

public class MukammalSon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n, sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    System.out.println(i);
                }
            }
            if (sum == a) {
                System.out.println("Mukammal son");
            } else {
                System.out.println("Mukammal son emas");
            }
    }
}
