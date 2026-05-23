package file_problems;

import java.io.File;

public class Gul {
     public static void main(String[] args){

         try {
             File newfile = new File("shohruz.txt");
             if (newfile.delete()) {
                 System.out.println(newfile.getName() + " File deleted successfully");
             }
         }  catch (Exception e) {
             System.out.println(e);
         }



     }
}
