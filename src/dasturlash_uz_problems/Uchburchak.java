package dasturlash_uz_problems;

public class Uchburchak {
    public static void main(String[] args) {
        System.out.println(yuza( 12,34,23));
    }
    public static double yuza(double a, double b, double c) {
        double p = (a + b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
