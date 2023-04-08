package com.practice.controller;


import com.practice.model.ServiceProvider;
import com.practice.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ServiceProviderController
{

    @Autowired
    ServiceProviderService serviceProviderService;


     @PostMapping("/arushimittal/addservice")
    public void addServiceProvider(@RequestBody ServiceProvider serviceDetails) {
         serviceProviderService.addProvider(serviceDetails);

    }
}