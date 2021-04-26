public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", 2);
        Estudiante e1 = new Estudiante("Gregory", 20, "2020039796");
        System.out.println(p1.tieneTiempo());
        System.out.println(e1.tieneTiempo());

        // Los siguientes dos objetos muestran un ejemplo de Override en el getId()
        Identificable e2 = new Estudiante("Juan", 28, "208140293");
        System.out.println(e2.getId());

        Identificable p3 = new Persona("Isaac", 36);
        System.out.println(p3.getId());

        //e2.presentarse();
        //p3.presentarse();
        //p1.draw();
    }
}
