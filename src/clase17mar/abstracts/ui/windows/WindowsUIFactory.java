package clase17mar.abstracts.ui.windows;

import clase17mar.abstracts.factory.UIFactory;
import clase17mar.abstracts.product.Button;
import clase17mar.abstracts.product.Label;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }
}
