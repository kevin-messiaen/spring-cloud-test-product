package fr.nextoo.micro.product.transformer;

import fr.nextoo.micro.product.dto.CategoryDto;
import fr.nextoo.micro.product.entity.Category;

import java.util.stream.Collectors;

public class CategoryTransformer {

    public static CategoryDto toDto(Category entity) {
        if (entity == null)
            return null;

        CategoryDto dto = new CategoryDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setParentId(getId(entity.getParent()));
        dto.setChildrenIds(
                entity.getChildren().stream()
                        .map(CategoryTransformer::getId)
                        .collect(Collectors.toList()));

        return dto;
    }

    public static Integer getId(Category entity) {
        return entity == null ? null : entity.getId();
    }
}
