package file_problems;

import java.io.File;
import java.util.Scanner;

public class file_ochish {
    public static void main(String[]ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("fayl nomini kiriting");
        String nomi = sc.nextLine();
        try {
            File files = new File(nomi);
            if (!files.exists()){
                files.createNewFile();
                System.out.println("fayl yaratildi");
            }else {
                System.out.println("fayl yaratilgan");
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
