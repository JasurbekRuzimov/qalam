package file_problems;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sardor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String x = sc.nextLine();
        try {
            File f = new File(x);
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("File created");
            }else {
                System.out.println("avvaldan mavjud!");
            }
        } catch (IOException e) {
            System.out.println("Error");

        }
    }
}
