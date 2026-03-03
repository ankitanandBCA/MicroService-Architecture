package com.addr.Controller;

import com.addr.DTO.AddressDto;
import com.addr.Service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
   private AddressServiceImpl addressService;

    @PostMapping("/save")
    public AddressDto saveaddress(@RequestBody AddressDto addressDto)
    {
        return  addressService.saveadd(addressDto);
    }

    @GetMapping("/show")
    public List<AddressDto> all()
    {
        return addressService.getall();
    }

    @GetMapping("/single/{id}")
    public AddressDto single(@PathVariable Long id)
    {
        return addressService.getSingleAdd(id);
    }


    @PutMapping("/updates/{id}")
    public AddressDto upd(@PathVariable Long id,   @RequestBody AddressDto addressDto)
    {
        return addressService.updateAdd(id,addressDto);
    }

    @DeleteMapping("/delete/{id}")
    public String dele(@PathVariable Long id) {
        return addressService.deleteAdd(id);
    }
}
