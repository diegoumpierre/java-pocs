package com.springmvc.springmvc.imperative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/customers")
class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        long start = System.currentTimeMillis();

        List<Customer> customerList = customerService.findAllCustomers();

        long end = System.currentTimeMillis();
        System.out.println("time to controller response: "+(end - start));

        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }




    @GetMapping(value = "/delay")
    public ResponseEntity<List<Customer>> getAllCustomersDelay() {
        long start = System.currentTimeMillis();

        List<Customer> customerList = customerService.findAllCustomersDelay1s();

        long end = System.currentTimeMillis();
        System.out.println("time to controller delay response: "+(end - start));

        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

}