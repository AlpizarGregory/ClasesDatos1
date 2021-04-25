public class Persona {
    // Es una buena práctica que los atributos sean privados
    private String nombre;
    protected int edad; // protected para que las clases hijas puedan acceder al atributo

    // Orden de visibilidad: public >> nada >> protected >> private
    // cuando no tiene nada entonces es público solo dentro del mismo package

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override // Para que se ignore el método toString de "Object" y utilice uno definido por la persona
    public String toString(){
        return this.nombre + ": " + this.edad;
    }

    public boolean tieneTiempo(){
        return true;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        if (valor < 18) {
            throw new IllegalArgumentException("Estudiantes deben ser mayores a 18");
        } else {
            this.edad = valor;
        }
    }
}
