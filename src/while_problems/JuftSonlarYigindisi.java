package while_problems;

import java.util.Scanner;

public class JuftSonlarYigindisi {
    public static void main(String[] args) {

        // ma'lumot giritish uchun console orqali
        Scanner ozgaruvchi = new Scanner(System.in);
        int a = ozgaruvchi.nextInt();  // 10
        int sum = 0;
// yig'indini hisoblash uchun loop sikl (har birini qo'shib chiqadi)
        while (a > 0) {
            sum = sum + a;// hisoblash
            a--;
        }
        System.out.println("Yig'indining qiymati: " + sum);

    }
}


// 1....n gacha bo'lgan sonlar yig'indisi
// ((1+10)/2)*10=55    ((1+n)/2)*n=