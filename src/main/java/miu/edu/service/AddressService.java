package miu.edu.service;

import miu.edu.dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findAddressById(int id);
    void deleteAddressById(int id);
    AddressDto save(AddressDto addressDto);

}
