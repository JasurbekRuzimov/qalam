package exception_problems;

public class Exception1 {
    public static void main(String[] args) {
        //1. compile time error
        // System.out.println("Error")

        //2. Runtime error
//        int x = 5;
//        System.out.println(x/0);

        //3. Logical Error
        int a = 10;
        int b = 5;
        int sum = a - b;
        System.out.println("sum = "+sum); // 15 expected.

        try {
           int s = 9;
            System.out.println(s/0);
        } catch (Exception e) {
            System.out.println("Sonni  0  ga bo'lish mumkin emas!");
        }
    }
}
