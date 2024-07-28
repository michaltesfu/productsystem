package miu.edu.ProductSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/products/view")
    public String viewProducts() {
        return "products"; // This refers to src/main/resources/templates/products.html
    }
}
