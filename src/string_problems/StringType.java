package string_problems;

import java.sql.SQLOutput;

public class StringType {
    public static void main(String[] args) {
        String text = "Upper Case";
        String text1 = "Upper Case";
        String text2 = "Lower Case u uchun alohida method bor uchun";
        String text3 = " Text ";
        String raqam1 = "4";
        int raqam2 = 8;

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text1.toLowerCase());
        System.out.println(text2.indexOf("uchun"));
        System.out.println(text.charAt(0));
        System.out.println(text.equals(text1));
        System.out.println("Dastlabki holat: "+"["+text3+"]");
        System.out.println("Keyingi holat:   "+"["+text3.trim()+"]");

        System.out.println(text1 + text3 + text2);
        System.out.println(text1.concat(text3));
        System.out.println(text1.concat(text3).concat(text2));

        System.out.println(raqam1+raqam2);

        System.out.println("kasnvdlasdlJABDLAHDBLAKDB \f \\DIYORBEK\\  fddffd ");
    }
}
