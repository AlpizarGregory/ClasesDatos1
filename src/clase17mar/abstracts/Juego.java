package clase17mar.abstracts;

import clase17mar.abstracts.factory.UIFactory;
import clase17mar.abstracts.product.Button;
import clase17mar.abstracts.product.Label;

public class Juego {
    private UIFactory uiFactory;

    public Juego(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    void foo() {
        Button b = this.uiFactory.createButton();
        b.click();

        Label l = this.uiFactory.createLabel();
        l.setText("Este es el texto");
    }
}
