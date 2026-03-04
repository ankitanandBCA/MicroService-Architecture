package com.emp.FigenClientApp;

import com.emp.DTO.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "ADDRESS")
public interface AddressClient {

    @GetMapping("/address/{id}")   // ✔ mapping mandatory
    AddressDto getAddress(@PathVariable("id") Long id);
}