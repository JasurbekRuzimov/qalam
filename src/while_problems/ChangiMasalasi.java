package while_problems;

public class ChangiMasalasi {
    public static void main(String[] args) {
        double masofa = 10;
        double umumiyMasofa = 0;
        int kun = 1;

        int kun20 = 0;
        int kun100 = 0;

        while (true) {
            umumiyMasofa += masofa;

            if (kun20 == 0 && masofa >= 20) {
                kun20 = kun;
            }

            if (kun100 == 0 && umumiyMasofa >= 100) {
                kun100 = kun;
            }

            if (kun20 != 0 && kun100 != 0) {
                break;
            }

            masofa = masofa * 1.1;
            kun++;
        }
        System.out.println("1 kunda 20 km dan kam bo‘lmagan kun: " + kun20 + " " + masofa);
        System.out.println("Jami 100 km dan oshgan kun: " + kun100 + " " + umumiyMasofa);
    }
}
