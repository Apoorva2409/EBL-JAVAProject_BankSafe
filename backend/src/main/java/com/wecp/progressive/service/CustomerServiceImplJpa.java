package com.wecp.progressive.service;

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.repository.CustomerRepository;
import com.wecp.progressive.repository.TransactionRepository;

//import antlr.collections.List;
import java.util.List;

@Service
public class CustomerServiceImplJpa {

    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
    public TransactionRepository transactionRepository;

    public List<Customers> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customers getCustomerById(int customerId){
        return customerRepository.findById(customerId).get();
    }

    public Customers addCustomer(Customers customers){
        return customerRepository.save(customers);
    }

    public void updateCustomer(int customerId, Customers customers){
        Customers c=customerRepository.findById(customerId).get();
        c.setName(customers.getName());
        c.setPassword(customers.getPassword());
        c.setUsername(customers.getUsername());
        c.setEmail(customers.getEmail());
        c.setRole(customers.getRole());
        customerRepository.save(c);
    }

    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
    }

    public List<Transactions>  getAllTransactionsByCustomerId(int cutomerId) {
        return  transactionRepository.getAllTransactionsByCustomerId(cutomerId);
}
}