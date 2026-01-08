package method_problems;

public class Method1 {
    public static void main(String[] args) {
        age_checker(13);
    }

    static void age_checker(int age) {
        if (age>=24){
            System.out.println("Teacher");
        } else if (age<19 && age>=18) {
            System.out.println("11-Sinf");
        } else if (age<=18 && age>17) {
            System.out.println("10-sinf");
        } else if (age<17 && age>=16) {
            System.out.println("9-sinf");
        }  else if (age<16 && age>=15) {
            System.out.println("8-sinf");
        }  else if (age<15 && age>=14) {
            System.out.println("7-sinf");
        }  else if (age<14 && age>=13) {
            System.out.println("6-sinf");
        }  else if (age<13 && age>=12) {
            System.out.println("5-sinf");
        }
        else {
            System.out.println("Boshqa sinf");
        }
    }
}
