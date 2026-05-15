package Set_problems;
import java.util.ArrayList;
public class Set2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("python");
        list.add("java");
        list.add("C++");
        list.add("Assembly");
        list.add("C");
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.remove("Assembly"));
        System.out.println(list);
        list.clear();
        System.out.println(list);



    }
}
