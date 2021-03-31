package clase10mar;

                    //extends
public class Persona implements Identificable{
    String cedula;
    String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = nombre + Integer.toString(edad); //Integer.toString es un conversor
    }

//    @Override
//    void drawContent() {
//        // Algo
//    }

    //Este método es necesario para implementar la interfaz
    public String getId() {
        return this.cedula;
    }

    @Override
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
