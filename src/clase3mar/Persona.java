package clase3mar;

public class Persona {
    static String pais = "Costa Rica"; // Es una variable de clase, no de instancia

    // Cuando un método es estático (static) aplica para la clase, no para las instancias

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        // Los this.xxxxx equivale al "self" de Python (Se refiere a él mismo)
        // No es obligatorio poner siempre el this, pero es muy útil
        this.nombre = nombre;
        this.edad = edad;
    }

    // La notación de Override es opcional, son solo para métodos
    @Override // Para que se ignore el método toString de "Object" y utilice uno definido por la persona
    public String toString(){
        return this.nombre + ": " + this.edad + ": " + pais;
    }

    public void hablar(){

    }

}
