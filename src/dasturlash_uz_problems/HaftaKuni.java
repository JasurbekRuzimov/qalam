package dasturlash_uz_problems;

public class HaftaKuni  {
    public static void main(String[] args) {
        hafta(7);

    }

    public static void hafta(int kun) {
        switch (kun) {
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;
            default:
                System.out.println("Bunday hafta kuni yoq, tugadi");
        }

    }
}
