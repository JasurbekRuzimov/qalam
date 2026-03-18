package dasturlash_uz_problems;

import encapsulation.Encapsulation;

public class Selsiy {
    public static void main(String[] args) {
        Encapsulation c = new Encapsulation();
        c.setName("Mirjalol");
        c.setSurname("Abdullayev");
        c.setEmail("mirjalol11@gmail.com");

        System.out.println(c.getName());
        System.out.println(c.getSurname());
        System.out.println(c.getEmail());







        System.out.println(celcium(10));
    }
    public static double celcium(double c){
        return (c+273);
    }


}
