package clase12mar;

import java.util.Comparator;

public class PersonaComparator implements Comparator<Persona> { // Comparator es una interfaz
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getId().compareTo(p2.getId()); // Ordena los valores del arreglo de acuerdo a su Id
        // p1 < p2 = n<0
        // p1 = p2 = 0
        // p1 > p2 = n>0
    }
}
