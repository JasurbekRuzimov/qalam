package file_problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File newfile = new File("C:\\Users\\Teacher\\IdeaProjects\\JavaLessons\\grechka.txt");
        try (Scanner myReader = new Scanner(newfile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals("Suxrob Yo'ldashboyev")) {
                    System.out.println(data);
                    break;
                }else{
                    System.out.println("  404 \n  NOT FOUND");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
