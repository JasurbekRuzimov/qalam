package while_problems;

import java.util.Scanner;

public class MukammalSon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n, sum = 0, b=1;
        while (b < n) {
            if (n % b == 0) {
                sum += b;
            }
            b++;
        }
        if (sum == n) {
            System.out.println("Mukammal son");
        } else {
            System.out.println("Mukammal son emas");
        }
    }
}
