package fr.nextoo.micro.product.service.impl;

import fr.nextoo.micro.product.dto.ProductDto;
import fr.nextoo.micro.product.repository.ProductRepository;
import fr.nextoo.micro.product.service.IProductService;
import fr.nextoo.micro.product.transformer.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Collection<ProductDto> findAll() {
        return productRepository.findAll().stream()
                .map(ProductTransformer::toDto)
                .collect(Collectors.toList());
    }

}
