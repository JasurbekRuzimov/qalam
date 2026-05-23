package file_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filega nima yozamiz");
        String file = scan.nextLine();
        try{
            File object =new File("shohruz.txt");
            FileWriter fw = new FileWriter(object,true);

            fw.write(file);
            fw.close();
            System.out.println(file + " File written successfully");




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
