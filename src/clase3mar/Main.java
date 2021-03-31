package clase3mar;

public class Main {
    public static void main(String[] args) {
        //Cada uno de estos objetos hereda de la clase "Object"
        Persona p1 = new Persona("Pedro", 2);
        Persona p2 = new Persona("Andrés", 20);
        Persona p3 = new Persona("Juan", 30);
        Persona p4 = new Persona("Judas", 13);

        // Se trata a un estudiante como si fuera una persona
        Persona p5 = new Estudiante("Fernando",15,"2020038597"); // Es polimorfismo

        // Se necesita el método toString para que imprima algo con sentido
        System.out.println(p1);
        Persona.pais = "Colombia"; // A partir de p2 todos son de Colombia, se puede cambiar solo a través de la clase
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4.edad);

        Estudiante e1 = new Estudiante("Gregory", 20, "2020039796");
        //El carne es necesario y se puede utilizar solo a nivel de Estudiante, no de Persona

        System.out.println(e1); //Utiliza el toString de persona
        System.out.println(p5); //También indica el carne
    } // End of main
} // End of Main
