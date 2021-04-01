package clase17mar.abstracts.ui.mac;

import clase17mar.abstracts.product.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button Clicked!");
    }
}
