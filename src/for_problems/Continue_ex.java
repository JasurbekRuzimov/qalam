package for_problems;

public class Continue_ex {
    public static void main(String[] args) {
        int i = 0;
        while (i < 7) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
