package file_problems;

import java.io.File;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File nomini yozing: ");
        String fileningOdi = sc.nextLine();
        try {
            File elyor = new File(fileningOdi);
            if (!elyor.exists()) {
                elyor.createNewFile();
                System.out.println("Fayl muvaffaqiyatli yaratildi!");
            } else {
                System.out.println("Fayl avval yaratilgan");
            }
        } catch (Exception e) {
            System.out.println("Yaratishda xatoliq");
            e.printStackTrace();
        }
    }
}
