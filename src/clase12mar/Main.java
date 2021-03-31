package clase12mar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>(); // Todos los datos del Array deben ser del MISMO tipo (int, String, float, ...)
        lista.add(new Persona("09","Gregory"));
        lista.add(new Persona("06","Mario"));
        lista.add(new Persona("01","Luigi"));
        lista.add(new Persona("03","Toad"));

        lista.sort(new PersonaComparator()); // Toma la lista y la ordena de acuerdo al comparador
        // lista.sort((o1, o2) -> o1.compareTo(o2)); // Expresión lambda
        for (Persona p : lista) {
            // Es recomendable utilizar esta denotación (se ve más ordenado)
            System.out.println(String.format("Nombre: %s, Id: %s", p.getNombre(), p.getId()));
            // Los valores %s son dinámicos: se deben cambiar por algo
        }

        // Las variables son "ciudadanos de primer clase" igual que los objetos (se puede hacer lo que se quiera con ellos)
    }
}
