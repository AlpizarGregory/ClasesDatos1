package abstracts.ui.windows;

import abstracts.factory.UIFactory;
import abstracts.product.Button;
import abstracts.product.Label;

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
