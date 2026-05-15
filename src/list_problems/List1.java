package list_problems;
import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Suxrob");
        students.add("Sardor");
        students.add("Sayilxon");
        students.add("Behruz");
        students.add("Akrom");
        students.add("Akrom");
        students.add("Akrom");
        students.add("Xursand");
        students.add("Shohruz");
        students.add("Hamidbek");
        students.add("Mirjalol");
        students.add("Kamoladdin");
        students.add("Sulaymon");
        students.addFirst("Begin");
        students.addLast("End");
        students.add(1, "Yangi");
        students.add(10, "Yangi 10");

        System.out.println(students.size());
        System.out.println(students);

        students.remove(1);
        students.remove("Akrom");
        System.out.println(students);
        System.out.println(students.get(7));
        students.set(7, "Xursandbek");
        System.out.println(students);

        students.clear();
        System.out.println(students);
    }
}