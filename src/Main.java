import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }



















        int x = input.nextInt();
        int summ = 0;
        while (x != 0) {
             int t = x % 10;
            summ = summ + t;
            x /= 10;
        }
        System.out.println(summ);
    }

}