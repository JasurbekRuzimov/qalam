package Map;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {

        TreeMap<String, String> coffee = new TreeMap<>();
        coffee.put("id","A001");
        coffee.put("name","cappuccino");
        coffee.put("type","dark");

        System.out.println(coffee.containsKey("id1")); // false
        System.out.println(coffee.containsKey("id"));  // true
        System.out.println(coffee.containsValue("01")); // false
        System.out.println(coffee.containsValue("A001")); // true

        System.out.println(coffee);

        System.out.println(coffee.get("id"));
        coffee.remove("type", "dark");
        System.out.println(coffee);

       coffee.clear();
        System.out.println(coffee);
    }
}
