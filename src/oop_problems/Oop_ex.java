package oop_problems;

public class Oop_ex {
    Car car = new Car();

    public  void  tenglik() {
        if (car.haydash2(7.0) == car.haydash(7)){
            System.out.println("Tenglik !");
        } else {
            System.out.println("Tengsizlik !");
        }
    }
}
