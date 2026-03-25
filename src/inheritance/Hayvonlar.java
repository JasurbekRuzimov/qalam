package inheritance;

class Animal{
    void eat(){
        System.out.println("ovqat yeydi");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("It vov-vov deydi");
    }
}
public class Hayvonlar {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
