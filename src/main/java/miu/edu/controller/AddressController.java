package miu.edu.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.dto.AddressDto;
import miu.edu.service.AddressService;
import miu.edu.service.imp.AddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    @Autowired
    private final AddressServiceImp addressService;
    @GetMapping
    public List<AddressDto> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public AddressDto findAddressById(@PathVariable int id) {
        return addressService.findAddressById(id);
    }

    @PostMapping
    public AddressDto save(@RequestBody AddressDto addressDto) {
        return addressService.save(addressDto);
    }
}
