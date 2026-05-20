package file_problems;

import java.io.File;
import java.util.Scanner;

public class otabek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File: ");
        String scan = sc.nextLine();
        try {
            File file = new File(scan);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("file created");
            }else{
                System.out.println("avvaldan mavjud!");
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
