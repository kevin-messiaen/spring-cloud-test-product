package fr.nextoo.micro.product.controller;

import fr.nextoo.micro.product.dto.CategoryDto;
import fr.nextoo.micro.product.dto.ProductDto;
import fr.nextoo.micro.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RequestMapping("/product")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    private ResponseEntity<Collection<ProductDto>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }
}
