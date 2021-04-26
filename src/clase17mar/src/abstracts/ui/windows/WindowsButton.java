package abstracts.ui.windows;

import abstracts.product.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button Clicked!");
    }
}
