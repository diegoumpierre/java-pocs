package com.springmvc.springmvc.imperative;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
    List<Customer> findAll();

}