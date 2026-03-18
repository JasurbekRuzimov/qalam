package inheritance;

public class ChildClass extends Inherit {

    public static void main(String[] args) {
        Inherit myObj = new Inherit();
        myObj.surname = "Farhodov";
        System.out.println(myObj.surname);
        System.out.println(myObj.name("Behruzbek"));
    }
}
