package ss19_string_regax.exercise.mvc_product.view;



import ss19_string_regax.exercise.mvc_product.controller.ProductController;
import ss19_string_regax.exercise.mvc_product.utils.ProductException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ProductException {
        ProductController.menuProductService();
    }
}