package miu.edu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Review {
    @Id
    private int id;
    private String comment;
    @ManyToOne()
    @JoinTable(name = "user_review")
    private User user;
}
