package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.exception.CustomerAlreadyExistsException;
import com.wecp.progressive.service.CustomerService;
import com.wecp.progressive.service.CustomerServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    public CustomerServiceImplJpa customerServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
        return new ResponseEntity<List<Customers>>(customerServiceImplJpa.getAllCustomers(),HttpStatus.OK);
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException {
        return new ResponseEntity<Customers>(customerServiceImplJpa.getCustomerById(customerId), null);
    }

    @PostMapping
    public ResponseEntity<Customers> addCustomer(@RequestBody Customers customers) {
        return new ResponseEntity<>(customerServiceImplJpa.addCustomer(customers),HttpStatus.OK);
    }

    @PutMapping("/{customerID}")
    public ResponseEntity<Void> updateCustomer(@PathVariable int customerId,@RequestBody Customers customers) {
        return null;
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int cutomerId) {
        return null;
    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<String> customerAlreadyExistsExceptionHandler(CustomerAlreadyExistsException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
    }
}
