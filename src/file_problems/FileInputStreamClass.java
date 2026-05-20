package file_problems;

import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamClass {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("grechka.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
