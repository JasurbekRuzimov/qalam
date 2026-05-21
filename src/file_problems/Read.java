package file_problems;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
     public static void main(String[] args) {
         File file = new File("Elyor.txt");
         FileReader reader = null;

         try{
             Scanner sc = new Scanner(file);

             while(sc.hasNextLine()){
                 System.out.println(sc.nextLine());
             }
         }catch (IOException e){
             System.out.println("Xato bor,bro.");
             e.printStackTrace();
             //checked
         }
    }
}
