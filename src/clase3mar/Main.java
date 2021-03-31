package clase3mar;

public class Main {
    public static void main(String[] args) {
        //Cada uno de estos objetos hereda de la clase "Object"
        Persona p1 = new Persona("Pedro", 2);
        Persona p2 = new Persona("Andrés", 20);
        Persona p3 = new Persona("Juan", 30);
        Persona p4 = new Persona("Judas", 13);

        // Se necesita el método toString para que imprima algo con sentido
        System.out.println(p1);
        Persona.pais = "Colombia"; // A partir de p2 todos son de Colombia
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    } // End of main
} // End of Main
