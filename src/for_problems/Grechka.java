package for_problems;

import java.util.Scanner;

public class Grechka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

//        for (String day : days) {
//            System.out.println(day);
//        }

//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[1]);
//        }

        System.out.println("Son kiriting: ");
        int mosh = sc.nextInt();
        double yarmi;

        for (int j = 1; j <= mosh; j++) {
            if (mosh % 2 == 0) {
                System.out.println(mosh);
            } else {
                yarmi = (double) mosh / 2;
                System.out.println(yarmi);
            }
        }
    }
}
