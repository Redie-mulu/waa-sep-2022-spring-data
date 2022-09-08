package miu.edu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Category category;

}
