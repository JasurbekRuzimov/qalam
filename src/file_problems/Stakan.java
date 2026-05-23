package file_problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stakan {
    public static void main(String[] args) {
        File newfile = new File("shohruz.txt");
        try (Scanner myStakan = new Scanner(newfile)){
          while (myStakan.hasNextLine()) {
              String data = myStakan.nextLine();
              System.out.println(data);
          }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
