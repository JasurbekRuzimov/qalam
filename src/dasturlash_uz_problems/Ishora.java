package dasturlash_uz_problems;

public class Ishora {
    public static void main(String[] args) {
        String a = ishora(1);
        System.out.println(a);
    }

    public static String ishora(int a) {
        if (a < 0) {
            return "manfiy";
        } else {
            return "musbat";
        }

    }
}
