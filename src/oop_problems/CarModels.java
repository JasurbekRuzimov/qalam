package oop_problems;

public class CarModels {
    public static void main(String[] args) {
        Car moshina = new Car();

        moshina.color = "Red";
        moshina.model = "Chevrolet";
        moshina.year =  2020;

        System.out.println("Moshina color is " + moshina.color);
        System.out.println("Moshina model is " + moshina.model);
        System.out.println("Moshina year is " + moshina.year);
    }
}
