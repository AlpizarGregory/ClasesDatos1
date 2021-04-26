package abstracts.ui.mac;

import abstracts.product.Label;

public class MacLabel implements Label {
    @Override
    public void setText(String text) {
        System.out.println("Set text for mac label");
    }
}