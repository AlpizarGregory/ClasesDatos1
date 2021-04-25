public class Estudiante extends Persona { //extends se utiliza para heredar
    String carne;

    public Estudiante(String nombre, int edad, String carne) {
        super(nombre,edad); // Para pasar los parámetros que el constructor espera
        this.carne = carne;
    }

    @Override // Es polimorfismo
    public String toString() {
        return super.toString() + ": " + this.carne;
    }
}

