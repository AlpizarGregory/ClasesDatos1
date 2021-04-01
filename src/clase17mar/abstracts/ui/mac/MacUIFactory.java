package clase17mar.abstracts.ui.mac;

import clase17mar.abstracts.factory.UIFactory;
import clase17mar.abstracts.product.Button;
import clase17mar.abstracts.product.Label;

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
