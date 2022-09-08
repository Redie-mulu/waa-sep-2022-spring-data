package miu.edu.repo;

import miu.edu.entity.Address;
import miu.edu.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepo extends CrudRepository<Address, Integer> {
    List<Address> findAll();
    Address findById();
    void deleteById();
    Product save(Address address);
    void updateById();
}
