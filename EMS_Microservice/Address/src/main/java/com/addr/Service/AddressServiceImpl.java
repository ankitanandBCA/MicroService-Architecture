package com.addr.Service;

import com.addr.DTO.AddressDto;
import com.addr.Model.Address;
import com.addr.Repositry.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService{


    @Autowired
    private AddressRepo addressRepo;
    private ModelMapper modelMapper;

    public AddressServiceImpl(AddressRepo addressRepo, ModelMapper modelMapper) {
        this.addressRepo = addressRepo;
        this.modelMapper = modelMapper;
    }




    @Override
    public AddressDto saveadd(AddressDto addressDto) {
          if(addressDto.getId()!=null)
          {
              throw new RuntimeException("Data Not present");
          }
        // dto -> entity
        Address map = modelMapper.map(addressDto, Address.class);
        // save data
        Address save = addressRepo.save(map);
        // entity -> dto
        return modelMapper.map(save,AddressDto.class);



    }

    @Override
    public List<AddressDto> getall() {
        List<Address> all = addressRepo.findAll();
        return all.stream().map(address -> modelMapper.map(address,AddressDto.class)).toList();
    }

    @Override
    public AddressDto getSingleAdd(Long id) {
        if(!addressRepo.existsById(id))
        {
            throw new RuntimeException("this id related data not found");
        }
        Address dataNotFound = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("data not found"));


        return modelMapper.map(dataNotFound,AddressDto.class);
    }

    @Override
    public String deleteAdd(Long id) {
        if(!addressRepo.existsById(id))
        {
            throw new RuntimeException("this id related data not found");
        }
        addressRepo.deleteById(id);
        return "Data deleted";
    }

    @Override
    public AddressDto updateAdd(Long id,AddressDto addressDto) {
        if(!addressRepo.existsById(id))
        {
            throw new RuntimeException("this id related data not found");
        }

        // dto -> entity
        Address map = modelMapper.map(addressDto, Address.class);
        // save
        map.setId(id);
        Address save = addressRepo.save(map);

        // entity -> dto
        return modelMapper.map(save,AddressDto.class);



    }
}
