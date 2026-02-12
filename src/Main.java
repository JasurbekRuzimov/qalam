public class Main {
    public static void main(String[] args) {
        bayroq();
        kitob("molxona");
    }
    static void bayroq() {
        System.out.println("Bizning xonada bayroq bor");
        String x = Main.kitob("1984");
        System.out.println("Bizning xonada " + x + " kitobi bor");
    }
    static String kitob(String kitob) {
        System.out.println(kitob);
        return kitob;
    }
}
