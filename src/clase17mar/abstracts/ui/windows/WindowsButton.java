package clase17mar.abstracts.ui.windows;

import clase17mar.abstracts.product.Button;

public class WindowsButton  implements Button {
    @Override
    public void click() {
        System.out.println("Windows button Clicked!");
    }
}
