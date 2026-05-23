package file_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Akromjon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("sardor.txt", true);
            fw.write(text);
            fw.close();
            System.out.println("File written to " + "sardor.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
