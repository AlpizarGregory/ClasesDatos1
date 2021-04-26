package abstracts;

import abstracts.factory.UIFactory;
import abstracts.ui.mac.MacUIFactory;
import abstracts.ui.windows.WindowsUIFactory;

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
