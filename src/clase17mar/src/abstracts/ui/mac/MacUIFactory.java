package abstracts.ui.mac;

import abstracts.factory.UIFactory;
import abstracts.product.Button;
import abstracts.product.Label;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Label createLabel() {
        return new MacLabel();
    }
}