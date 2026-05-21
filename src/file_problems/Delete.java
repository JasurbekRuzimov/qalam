package file_problems;

import java.io.File;

public class Delete {
    public static void main(String[] args) {

        File file = new  File("C:\\Users\\Teacher\\IdeaProjects\\JavaLessons\\Otabek");
        if (file.delete()){
            System.out.println("File o'chdi");

        }else {
            System.out.println("File not deleted");
        }
    }
}
