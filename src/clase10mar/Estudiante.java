package clase10mar;


public class Estudiante extends Persona {
    String carne;

    public Estudiante(String nombre, int edad, String carne) {
        super(nombre,edad);
        this.carne = carne;
    }

    @Override
    public String getId(){
        return this.carne;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + this.carne;
    }

    public boolean tieneTareas() {
        return true;
    }

    @Override
    public boolean tieneTiempo() {
        return !tieneTareas();
    }
}
