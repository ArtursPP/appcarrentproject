package com.apprentcarproject.repository;


import com.apprentcarproject.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

    List<Customers> findAllByCustomerNameIgnoreCase(String customerName);

    List<Customers>findAllByCustomerLastNameIgnoreCase(String customerLastName);
}
