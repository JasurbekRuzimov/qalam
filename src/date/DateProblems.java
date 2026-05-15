package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateProblems {
    public static void main(String[] args) {

        LocalDate sana = LocalDate.now();
        LocalTime soat = LocalTime.now();
        LocalDateTime vaqt = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("E, d-MMM yyyy");

        System.out.println(sana);
        System.out.println(soat);
        System.out.println(vaqt);
        System.out.println(sana.format(formatDate));

        Calendar date = Calendar.getInstance();
        System.out.println("Yil : " + date.get(Calendar.YEAR));
        System.out.println("Oy : " + date.get(Calendar.MONTH));
        System.out.println("Oyning : " + date.get(Calendar.DAY_OF_MONTH) + "-kuni");
        System.out.println("Yilning " + date.get(Calendar.DAY_OF_YEAR) + "-kuni");
        System.out.println("Haftaning " + date.get(Calendar.DAY_OF_WEEK) + "-kuni");
        System.out.println("Soat  " + date.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minut  " + date.get(Calendar.MINUTE));
        System.out.println("Sekund  " + date.get(Calendar.SECOND));
        System.out.println("AM yoki PM  " + date.get(Calendar.AM_PM));


        date.set(1981, 6, 12, 11, 30, 40);

        System.out.println("\n\nYil : " + date.get(Calendar.YEAR));
        System.out.println("Oy : " + date.get(Calendar.MONTH));
        System.out.println("Oyning : " + date.get(Calendar.DAY_OF_MONTH) + "-kuni");
        System.out.println("Yilning " + date.get(Calendar.DAY_OF_YEAR) + "-kuni");
        System.out.println("Haftaning " + date.get(Calendar.DAY_OF_WEEK) + "-kuni");
        System.out.println("Soat  " + date.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minut  " + date.get(Calendar.MINUTE));
        System.out.println("Sekund  " + date.get(Calendar.SECOND));
        System.out.println("AM yoki PM  " + date.get(Calendar.AM_PM));



        /// Bugun qo'shko'pirda soat ... sana oy  yil
        // yilning  - guni
        // yilning  - oyi


    }
}
