package inheritance;

public class Inherit {
    public String name;
    public String surname;
    public String group;
    public int age;
    public String phoneNumber;

    public int birMethod(int a, int b) {
        return a + b;
    }

    public String name(String name) {
        this.name = name;
        return name;
    }
}