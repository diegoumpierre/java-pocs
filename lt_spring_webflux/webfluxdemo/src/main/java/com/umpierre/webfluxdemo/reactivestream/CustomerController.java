package com.umpierre.webfluxdemo.reactivestream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/customers")
class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<Customer>> getAllCustomers() {
        long start = System.currentTimeMillis();

        Flux<Customer> customerList = customerService.getAllCustomers();

        long end = System.currentTimeMillis();
        System.out.println("time to controller webfluxdemo response: "+(end - start));

        return ResponseEntity.ok(customerList);
    }


    @GetMapping(value = "/streamblock")
    public ResponseEntity<List<Customer>> getAllCustomersBlock() {
        long start = System.currentTimeMillis();

        Flux<Customer> lstFlux = customerService.getAllCustomers();

        List<Customer> customerList = lstFlux.collectList().block();

        long end = System.currentTimeMillis();
        System.out.println("time to controller webfluxdemo block response: "+(end - start));

        return ResponseEntity.ok(customerList);
    }

    @GetMapping(value = "/streamdelay",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<Customer>> getAllCustomersDelay() {
        long start = System.currentTimeMillis();

        Flux<Customer> customerList = customerService.getAllCustomersWithDelay().log();

        long end = System.currentTimeMillis();
        System.out.println("time to controller webfluxdemo delay response: "+(end - start));

        return ResponseEntity.ok(customerList);
    }
}
