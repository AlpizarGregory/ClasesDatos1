package abstracts;

import abstracts.factory.UIFactory;
import abstracts.product.Button;
import abstracts.product.Label;

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
