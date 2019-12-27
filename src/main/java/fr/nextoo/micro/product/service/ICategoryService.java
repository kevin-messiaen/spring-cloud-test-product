package fr.nextoo.micro.product.service;

import fr.nextoo.micro.product.dto.CategoryDto;

import java.util.Collection;

public interface ICategoryService {

    Collection<CategoryDto> findAll();

}
