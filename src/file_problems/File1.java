package file_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("File nomini kiriting: ");
        String fileName = sc.nextLine();
        System.out.println("Faylga nima yozamiz: ");
        String text = sc.nextLine();


        try {
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("\n" + text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}