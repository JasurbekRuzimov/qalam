package arrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

//        cars.add("Volvo");//0
//        cars.add("BMW");//1
////        //2 Mazda
//        cars.add("Ford");
////
////
//        cars.add(2, "Mazda"); // Insert element at the beginning of the list (0)
//        cars.clear();
//       cars.remove("Volvo");
//       System.out.println(cars.size());
//        System.out.println(cars);

int n = 10;
outer:
for (int i = 2; i < n; i++) {
    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            continue outer;
        }

    }
    System.out.println(i);
}
    }
}
