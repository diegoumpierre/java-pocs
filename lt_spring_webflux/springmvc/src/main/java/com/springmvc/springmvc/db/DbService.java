package com.springmvc.springmvc.db;

import com.springmvc.springmvc.imperative.Customer;
import com.springmvc.springmvc.imperative.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class DbService {

    @Autowired
    private CustomerRepository customerRepository;

    public void insertInitialData(){

        IntStream.rangeClosed(1,1000)
                .peek(i->System.out.println("processing count: "+i))
                .mapToObj(i->customerRepository.save(Customer.builder().name("customer"+i).build()))
                .collect(Collectors.toList());
    }

}
