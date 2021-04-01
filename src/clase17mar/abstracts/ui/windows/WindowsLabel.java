package clase17mar.abstracts.ui.windows;

import clase17mar.abstracts.product.Label;

public class WindowsLabel implements Label {
    @Override
    public void setText(String text) {
        System.out.println("Set text for windows label");
    }
}
