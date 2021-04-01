package clase17mar.abstracts;

import clase17mar.abstracts.factory.UIFactory;
import clase17mar.abstracts.ui.mac.MacUIFactory;
import clase17mar.abstracts.ui.windows.WindowsUIFactory;

// El abstract factory se centra en esta clase
public class Main {
    public static void main(String[] args) {
        //Solamente en el main se verifica cual es el sistema operativo
        var operatingSystem = System.getenv("os.name");
        UIFactory factory;

        if (operatingSystem == "windows") {
            factory = new WindowsUIFactory();
        } else if (operatingSystem == "mac") {
            factory = new MacUIFactory();
        } else {
            throw new RuntimeException("Unsopported operating system");
        }

        new Juego(factory).foo();
    }
}
