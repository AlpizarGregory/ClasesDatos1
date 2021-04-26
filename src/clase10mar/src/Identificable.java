// La interfaz no tiene cuerpo, no se puede utilizar por sí sola
// NO ES POSIBLE instanciar una interfaz

public interface Identificable {
    String getId();
}

//public abstract class Identificable {
//    String id;
//
//    public void presentarse() {
//        System.out.println("Hola, mi id es: " + this.getId());
//    }
//
//    public void draw() {
//        this.drawHeader();
//        this.drawContent();
//        this.drawFooter();
//    }
//
//    protected public void drawHeader() {
//        // Algo interesante
//    }
//
//    protected public void drawFooter() {
//        // Algo interesante
//    }
//
//    protected abstract void drawContent(); // Las clases hijas deben indicar que hay en drawContent
//
//    abstract String getId(); //Si es abstracto NO PUEDE tener cuerpo
//}