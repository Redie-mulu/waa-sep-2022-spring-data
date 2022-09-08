package miu.edu.repo;

import miu.edu.entity.Product;
import miu.edu.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findAll();
    User findById();
    void deleteById();
    User save(User p);
    void updateById();
}
