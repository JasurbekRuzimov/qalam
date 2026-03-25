package kep_uz_problems;

import java.util.Scanner;

public class Problem96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double ortaArifmetik = (double) (n + m) / 2;
        System.out.println(ortaArifmetik);

        double ortaGeometrik = (double)Math.sqrt(m*n);
        System.out.println(ortaGeometrik);
    }
}
