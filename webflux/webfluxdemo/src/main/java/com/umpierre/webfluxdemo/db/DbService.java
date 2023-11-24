package com.umpierre.webfluxdemo.db;

import com.umpierre.webfluxdemo.reactivestream.Customer;
import com.umpierre.webfluxdemo.reactivestream.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class DbService {

    @Autowired
    CustomerRepository customerRepository;

    public void insertData() {
        IntStream.rangeClosed(1,4)
                .peek(i->System.out.println("processing count: "+i))
                .mapToObj(i->customerRepository.save(Customer.builder().id(new Long(i+100)).name("customer"+i).build()))
                .collect(Collectors.toList());


    }
}
