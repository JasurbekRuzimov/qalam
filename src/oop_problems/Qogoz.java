package oop_problems;

public class Qogoz {
    public static void main(String[] args) {
        Qogoz q = new Qogoz();
        q.yozuv();
    }
    Daftar notebook = new Daftar();

    public void yozuv() {
        notebook.type = "yo'l yo'l daftar";
        notebook.pageNumber = 36;
        notebook.color = "Oq qora";
        notebook.country = "Uzbekistan";

        System.out.println(notebook.pageNumber +
                " betli " + notebook.color +
                " rangdagi " + notebook.type +
                " " + notebook.country + "da ishlab chiqarilgan!");
    }
}