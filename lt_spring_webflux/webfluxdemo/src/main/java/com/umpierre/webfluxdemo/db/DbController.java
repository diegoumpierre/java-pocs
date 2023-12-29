package com.umpierre.webfluxdemo.db;

import com.umpierre.webfluxdemo.reactivestream.Customer;
import com.umpierre.webfluxdemo.reactivestream.CustomerService;
import io.r2dbc.h2.H2Connection;
import io.r2dbc.h2.H2ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    H2ConnectionFactory h2ConnectionFactory;

    @Autowired
    DbService dbService;

    @GetMapping(value = "/init",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<Customer>> test() {
        H2Connection h2Connection = h2ConnectionFactory.create().block();

        h2Connection.createStatement("CREATE TABLE customer (\n" +
                "id INT NOT NULL,\n" +
                "name VARCHAR(50) NOT NULL"+
                ");").execute().subscribe();

        return ResponseEntity.ok(null);
    }

    @GetMapping(value = "/insert")
    public ResponseEntity<String> insertData() {

        dbService.insertData();

        return ResponseEntity.ok("Dados inseridos");
    }

}
