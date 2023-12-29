package com.umpierre.webfluxdemo.reactivestream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Flux<Customer> getAllCustomers() {
        long start = System.currentTimeMillis();

        Flux<Customer> customerList = customerRepository.findAll();

        long end = System.currentTimeMillis();
        System.out.println("time to repository webfluxdemo response: "+(end - start));

        return customerList;
    }





    public Flux<Customer> getAllCustomersWithDelay(){

        List<Customer> customerList = new ArrayList<>();
        for(int i=0;i<10;i++) {
            customerList.add(Customer.builder().id(new Long(i)).name("customer" + i).build());
        }

        Flux<Customer> customerFlux = Flux.fromIterable(customerList)
                .delayElements(Duration.ofSeconds(1));

        return customerFlux;
    }


}
