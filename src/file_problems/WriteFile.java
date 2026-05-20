package file_problems;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Faylga nima yozamiz: ");
        String text = sc.nextLine();
        try {
            FileWriter fileWriter = new FileWriter("Akrom.txt", true);
            fileWriter.write(" " + text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}