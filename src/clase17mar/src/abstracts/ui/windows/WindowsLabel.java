package abstracts.ui.windows;

import abstracts.product.Label;

public class WindowsLabel implements Label {
    @Override
    public void setText(String text) {
        System.out.println("Set text for windows label");
    }
}