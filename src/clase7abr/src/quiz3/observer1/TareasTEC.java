package quiz3.observer1;
// Este es un servidor donde se almacenan las asignaciones pendientes para los estudiantes

public class TareasTEC implements Notificaciones {
    String nuevaTarea; // Nueva tarea asignada por el profesor@

    Notificaciones notificador = new Notificaciones() {
    };

    public String getNuevaTarea() {
        return nuevaTarea;
    }

    public void setNuevaTarea(String nuevaTarea) {
        this.nuevaTarea = nuevaTarea;
        notificador.enviarNotificacion(); // Se le notifica a los estudiantes que se realizó un cambio
    }
}
