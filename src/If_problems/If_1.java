package If_problems;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Raqam kiriting: ");
        int x = scanner.nextInt();

        if (x>5){
            System.out.println("Bu son 5 dan katta");
        } else if (x==5) {
            System.out.println("Bu son 5 ga teng");
        } else {
            System.out.println("Bu son 5 dan kichik");
        }


        noWork("ABRORBEK");
    }

    static void noWork(String text){
        if (text.equals("ABRORBEK")){
            System.out.println("Bu foydalanuvchi nomi ABRORBEK");
        } else {
            System.out.println("Boshqa user ");
        }
    }
}
