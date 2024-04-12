package com.example.ce4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce4.model.Address;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address methodName()
    {
      Address ad=new Address("Mega",123,"Main St",641105,"Anbu nagar","Coimbatore","Tamil nade","India");
      return ad;
    }
}
