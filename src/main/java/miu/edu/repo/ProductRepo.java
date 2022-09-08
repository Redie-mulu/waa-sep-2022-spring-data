package miu.edu.repo;

import miu.edu.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAll();
    Product findById();
    void deleteById();
    Product save(Product p);
//    void updateById(int id, Product product);


}
