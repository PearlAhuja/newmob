package com.practice.service;

import com.practice.model.ServiceProvider;
import org.springframework.stereotype.Service;

@Service
public class ServiceProviderService {


    public void addProvider(ServiceProvider serviceDetails) {
         addProviderinDB(serviceDetails);
    }

}
