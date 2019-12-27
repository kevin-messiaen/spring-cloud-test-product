package fr.nextoo.micro.product.service.impl;

import fr.nextoo.micro.product.dto.CategoryDto;
import fr.nextoo.micro.product.repository.CategoryRepository;
import fr.nextoo.micro.product.service.ICategoryService;
import fr.nextoo.micro.product.transformer.CategoryTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Collection<CategoryDto> findAll() {
        return categoryRepository.findAll().stream()
                .map(CategoryTransformer::toDto)
                .collect(Collectors.toList());
    }

}
