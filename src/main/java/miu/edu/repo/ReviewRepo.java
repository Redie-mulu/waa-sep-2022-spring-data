package miu.edu.repo;

import miu.edu.entity.Product;
import miu.edu.entity.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findAll();
    Review findById();
    void deleteById();
    Review save(Review review);
    void updateById();
}
