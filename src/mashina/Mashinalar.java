package mashina;
interface Mashina{
    void harakatlanadi();
}
class BMW implements Mashina{
    public void harakatlanadi() {
        System.out.println("BMW benzinda harakatlanadi");
    }
}
class Teslo implements Mashina{
    public void harakatlanadi() {
        System.out.println("Teslo elektrda harakatlanadi");
    }
}

public class Mashinalar {
    public static void main(String[] args) {
        Mashina m1 = new BMW();
        Mashina m2 = new Teslo();

        m1.harakatlanadi();
        m2.harakatlanadi();
    }

}
