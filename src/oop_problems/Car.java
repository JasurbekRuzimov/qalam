package oop_problems;

public class Car {
    public String color;
    public String model;
    public int year;
    public double price;
    public int speed;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car( String model, String color, int year, double price) {
        this.price = price;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Car( String model, String color, int year, double price, int speed) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
        this.speed = speed;
    }



    public static void main(String[] args) {
    }

    public int haydash(int a) {
        return a * a;
    }

    public double haydash2(double b) {
        return b * b;
    }
}