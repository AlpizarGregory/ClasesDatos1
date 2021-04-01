package clase17mar.abstracts.factory;

import clase17mar.abstracts.product.Button;
import clase17mar.abstracts.product.Label;

public interface UIFactory {
    Button createButton();
    Label createLabel();
}
