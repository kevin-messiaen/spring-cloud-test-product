package fr.nextoo.micro.product.service;

import fr.nextoo.micro.product.dto.ProductDto;

import java.util.Collection;

public interface IProductService {

    Collection<ProductDto> findAll();

}
