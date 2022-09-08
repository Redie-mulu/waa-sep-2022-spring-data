package miu.edu.service.imp;

import miu.edu.dto.AddressDto;
import miu.edu.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImp implements AddressService {
    @Override
    public List<AddressDto> findAll() {
        return null;
    }

    @Override
    public AddressDto findAddressById(int id) {
        return null;
    }

    @Override
    public void deleteAddressById(int id) {

    }

    @Override
    public AddressDto save(AddressDto addressDto) {
        return null;
    }
}
