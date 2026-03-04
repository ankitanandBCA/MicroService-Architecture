package com.addr.Service;

import com.addr.DTO.AddressDto;
import com.addr.Model.Address;

import java.util.List;

public interface AddressService {




  public   AddressDto saveadd( AddressDto addressDto);

    public List<AddressDto> getall();

    public AddressDto getSingleAdd(Long id);

    public String deleteAdd(Long id);

    public AddressDto updateAdd(Long id,AddressDto addressDto);
}
