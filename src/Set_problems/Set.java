package Set_problems;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {


       // Make a decision is necessary skill.
        // LIFO - Last Input First Output
       HashSet<String> topic = new HashSet<>();

       topic.add("OOP in Java");
       topic.add("Inheritance");
       topic.add("Polymorphism");
       topic.add("Abstraction");
       topic.add("Encapsulation");

       System.out.println(topic);
       System.out.println(topic.size());
       System.out.println(topic.contains("Encapsulation"));

       System.out.println(topic.remove("Abstraction"));
       System.out.println(topic);

       topic.clear();
       System.out.println(topic);
    }
}
