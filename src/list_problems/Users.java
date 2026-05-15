package list_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Nechta element qo'shamiz: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers.add(sc.nextInt());

            if (numbers.get(i)==0){
                System.out.println(numbers);
                break;
            }
        }
    }
}
