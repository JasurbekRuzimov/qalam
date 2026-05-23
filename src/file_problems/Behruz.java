package file_problems;

import java.io.File;
import java.util.Scanner;

public class Behruz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qaysi Fayln o'chiramiz: ");
        String fayln = input.nextLine();
        File f = new File(fayln);
        if (f.delete()) {
            System.out.println("Fayl O'chdi");
        } else {
            System.out.println("Xato");
        }
    }
}
