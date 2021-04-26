import java.util.Date;

public class Persona { //implements Comparable<Persona>
    private String id;
    private String nombre;
    private Date fechaNacimiento;

    // En Code >> Generate >> Getter and Setter / Constructor
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

//    @Override
//    public int compareTo(Persona o) {
//        if (o == null) {
//            throw new IllegalArgumentException("o cannot be null");
//        }
//        return this.getId().compareTo(o.getId());
//    }
}
