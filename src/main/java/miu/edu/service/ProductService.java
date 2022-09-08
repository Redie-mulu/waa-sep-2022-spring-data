package miu.edu.service;

import miu.edu.dto.ProductDto;
import miu.edu.entity.Product;

import java.util.List;


public interface ProductService {
    public Product save(ProductDto productDto);
    public List<ProductDto> findAll();
    void deleteById();

//    void updateById()




}
