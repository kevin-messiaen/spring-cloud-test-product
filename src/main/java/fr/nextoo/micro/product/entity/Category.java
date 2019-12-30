package fr.nextoo.micro.product.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "category")
@Getter
@Setter
@Builder
public class Category {

    @Id
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private Collection<Category> children;

    @OneToMany(mappedBy = "category")
    private Collection<Product> products;


}
