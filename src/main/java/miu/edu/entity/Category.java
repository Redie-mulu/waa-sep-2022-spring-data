package miu.edu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    private int id;
    private String name;

//    private List<Product> products;
}
