package file_problems;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File newfile = new File("C:\\Users\\Teacher\\IdeaProjects\\JavaLessons\\azizbek.txt");
        if (newfile.delete()) {
            System.out.println(newfile.getName() + " File deleted successfully");
        } else {
            System.out.println(newfile.getName() + " File not deleted successfully");
        }

    }
}
