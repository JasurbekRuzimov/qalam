package while_problems;

import java.util.Scanner;

public class SonlarYigindisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int summ = 0;
        while(a !=0){
            summ += a;
            a--;
        }
        System.out.println(summ);
    }
}
