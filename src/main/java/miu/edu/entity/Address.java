package miu.edu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String zip;
    private String city;
}
