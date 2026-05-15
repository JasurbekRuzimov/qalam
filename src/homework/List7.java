package homework;

import java.util.Scanner;

public class List7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aziz =sc.nextLine() ;
        int probellar = 0;
        for (int  i= 0; i < aziz.length(); i++) {
            if (aziz.charAt(i) == ' ') {
                probellar++;
            }
        }
        System.out.println(probellar);
    }
}
