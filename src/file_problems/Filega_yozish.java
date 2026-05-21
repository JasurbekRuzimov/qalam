package file_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filega_yozish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matn = sc.nextLine();

        try {
            FileWriter f = new FileWriter("Elyor.txt", true);
            f.write(matn);
            f.close();
            System.out.println("Muvoffaqiyatli yozildi!");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
