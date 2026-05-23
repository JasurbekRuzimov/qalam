package file_problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Suhrob {
    public static void main(String[] args) {
        File myObj = new File("sardor.txt");
        try(Scanner text = new Scanner(myObj)){
            while (text.hasNextLine()) {
                String nom = text.nextLine();
                System.out.println(nom);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
