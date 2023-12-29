package com.springmvc.springmvc.imperative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
class CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        long start = System.currentTimeMillis();

        List<Customer> customerList = customerRepository.findAll();

        long end = System.currentTimeMillis();
        System.out.println("time to repository response: "+(end - start));

        return customerList;
    }


    public List<Customer> findAllCustomersDelay1s(){
        List<Customer> customerList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            customerList.add(Customer.builder().id(new Long(i)).name("customer"+i).build());
            System.out.println("read the: "+i+ " customer");
        }
        long end = System.currentTimeMillis();
        System.out.println("time to delay response: "+(end - start));

        return customerList;
    }


}