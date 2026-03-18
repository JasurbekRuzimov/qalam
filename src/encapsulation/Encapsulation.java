package encapsulation;

public class Encapsulation {
    private String name;
    private  String surname;
    private String email;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return   this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
