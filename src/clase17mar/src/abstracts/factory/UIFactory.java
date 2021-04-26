package abstracts.factory;

import abstracts.product.Button;
import abstracts.product.Label;

public interface UIFactory {
    Button createButton();
    Label createLabel();
}
