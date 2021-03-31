package clase12mar.singletonEjm;

public class DBConnection {
    // Se debe tener una instancia estática
    private static DBConnection instance = null;

    // Método más importante del Singleton
    public static synchronized DBConnection getInstance() { // Se debe agregar el synchronized
        if (instance == null) {
            System.out.println(Thread.currentThread().getName() + ": Se creó el DBConnection");
            instance = new DBConnection();
        }
        System.out.println(Thread.currentThread().getName() + ": Se devolvió el DBConnection");
        return instance;
    }

    // El constructor debe ser privado
    private DBConnection () {
        this.getConfiguration();
    }

    public void connect() {
        // Hace algo últil
    }

    public void disconnect() {
        // Hace algo últil
    }

    private void getConfiguration() {
        // Hace algo muy complicado e intensivo de CPU
    }
}
