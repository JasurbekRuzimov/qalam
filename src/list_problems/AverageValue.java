package list_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Nechta element qo'shamiz: ");
        int n = sc.nextInt();
        double average =  0;
        for (int i = 0; i <n ; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <n ; i++) {
            average = average +list.get(i);
        }
        System.out.println("O'rtacha qiymat = " + average/n);
    }
}
