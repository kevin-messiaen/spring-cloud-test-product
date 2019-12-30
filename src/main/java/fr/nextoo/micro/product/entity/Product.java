package fr.nextoo.micro.product.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@Builder
public class Product {

    @Id
    private Integer id;

    @Column(unique = true)
    private String label;

    @Column(name = "description")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
