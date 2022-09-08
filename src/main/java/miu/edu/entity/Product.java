package miu.edu.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Category category;

}
