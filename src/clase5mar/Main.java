package clase5mar;

import clase5mar.Persona;

public class Main {
    public static void main(String[] args) {
        clase5mar.Persona p1 = new Persona("Pedro", 2);
        System.out.println(p1.tieneTiempo());

        Estudiante e1 = new Estudiante("Gregory", 20, "2020039796");
        System.out.println(e1.tieneTiempo());
    }
}
