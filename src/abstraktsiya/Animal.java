package abstraktsiya;

abstract class Hayvon {
    void a(){
        System.out.println("Mushuk");
    }
}
class Cat extends Hayvon {
    void b() {
        System.out.println("baliq yeydi");
    }
}
public class Animal{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.a();
        c.b();
    }
}