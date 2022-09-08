package miu.edu.repo;

import miu.edu.entity.Category;
import miu.edu.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
    List<Category> findAll();
    Category findById();
    void deleteById();
    Category save(Category category);
    void updateById();
}
