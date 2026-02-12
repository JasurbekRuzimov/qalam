package oop_problems;

public class Car {
    public String color;
    public String model;
    public int year;

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "blue";
        bmw.model = "bmw_m5";
        bmw.year = 2018;

        System.out.println(bmw.color);
        haydash();

        Car nissan = new Car();
        nissan.color = "red";
        nissan.model = "Nissan gtr 35";
        nissan.year = 2021;
        System.out.println(nissan.model);

        Car gentra = new Car();
        gentra.color = "black";
        gentra.model = "gentra";
        gentra.year = 2023;
        System.out.println(gentra.color);

        Car lexus = new Car();
        lexus.color = "red";
        lexus.model = "lexus";
        lexus.year = 2021;
        System.out.println(lexus.color);
        System.out.println(lexus.model);

        Car alex = new Car();
        alex.color = "navy";
        alex.model = "alex";
        alex.year = 2021;

        System.out.println("That car is named " + alex.model + " and it is made in " + alex.year + ". And it has the color of " + alex.color + ".\nBruuuuuhhhh why do you need a new line, Diyor?");


        System.out.println("\n\nHi again, Jasurbek!\nI am going to home and have no other words to say except bye bye!\nSincerely,\nSulaymon.");
    }

    public static void haydash() {
        System.out.println("haydash");
    }
}