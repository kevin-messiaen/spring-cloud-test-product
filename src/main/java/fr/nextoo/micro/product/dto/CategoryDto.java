package fr.nextoo.micro.product.dto;

import java.util.Collection;

public class CategoryDto {

    private Integer id;
    private String name;
    private Integer parentId;
    private Collection<Integer> childrenIds;

    public CategoryDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Collection<Integer> getChildrenIds() {
        return childrenIds;
    }

    public void setChildrenIds(Collection<Integer> childrenIds) {
        this.childrenIds = childrenIds;
    }
}
