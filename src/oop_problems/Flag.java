package oop_problems;

public class Flag {

    public String color = "ckjhs";
    private String country;
    protected int pro;
    String kalla;
    int bosh;   // default


    public  Flag(){
      // constructor
        System.out.println("Bu bo'sh");
    }

    public Flag(String color, String country) {
        this.color = color;
        this.country = country;
    }
}
