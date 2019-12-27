package fr.nextoo.micro.product.transformer;

import fr.nextoo.micro.product.dto.ProductDto;
import fr.nextoo.micro.product.entity.Product;

public class ProductTransformer {

    public static ProductDto toDto(Product entity) {
        if (entity == null)
            return null;

        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setLabel(entity.getLabel());
        dto.setDesc(entity.getDesc());
        dto.setCategoryId(CategoryTransformer.getId(entity.getCategory()));

        return dto;
    }

}
