package com.springmvc.springmvc.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    DbService dbService;

    @GetMapping("/initDB")
    public ResponseEntity<String> initDataBaseCustomer() {
        dbService.insertInitialData();
        return new ResponseEntity<>("Dados Inseridos", HttpStatus.OK);
    }

}
