package dasturlash_uz_problems;

public class Gipotenuza {
    public static void main(String[] args) {
        System.out.println(gipotenuza(3,4));
    }
    public static double gipotenuza(double x, double y){
        double c = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(c);
    }
}
