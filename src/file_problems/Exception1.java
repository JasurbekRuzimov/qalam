package file_problems;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("fayl yaratildi");
        String scan = sc.nextLine();
        try {
            File file = new File(scan);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file.getName() + " File created successfully");
            }else  {
                System.out.println(file.getName() + " File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
