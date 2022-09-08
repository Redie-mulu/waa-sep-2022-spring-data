package miu.edu.service.imp;

import lombok.RequiredArgsConstructor;
import miu.edu.dto.ProductDto;
import miu.edu.entity.Product;
import miu.edu.repo.ProductRepo;
import miu.edu.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {
    private final ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public Product save(ProductDto productDto) {

        return productRepo.save(modelMapper.map(productDto, Product.class));

    }

    @Override
    public List<ProductDto> findAll() {
        return null;
    }

    @Override
    public void deleteById() {

    }
}
