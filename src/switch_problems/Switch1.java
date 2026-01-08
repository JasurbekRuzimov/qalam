package switch_problems;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Kirish");
            System.out.println("2. Ro'yxatdan o'tish");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Tizimga kiramiz");
                    System.out.println("Ismingizni kiriting: ");
                    String name = sc.next();
                    if (name.equals("Sarvarbek")) {
                        System.out.println("Parolni kiriting: ");
                        String password = sc.next();
                        if (password.equals("12345")) {
                            System.out.println("You successfully logged in");
                        }
                        else {
                            System.out.println("You are not logged in");
                        }
                    }else {
                        System.out.println("Something went wrong");
                    }
                    break;
                case 2:
                    System.out.println("Ro'yxatdan o'tamiz");
                    break;
                default:
                    System.out.println("Bunday buyruq yo'q");
            }
        }
    }
}
