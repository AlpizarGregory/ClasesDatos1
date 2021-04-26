package abstracts.ui.mac;

import abstracts.product.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button Clicked!");
    }
}
