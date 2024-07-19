package com.wecp.progressive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

@Service
public class AccountServiceImplJpa {
    @Autowired
    public AccountRepository accountRepository;

    public List<Accounts> getAllAccounts() {
        return accountRepository.findAll();
    }
    public Accounts getAccountById(int accountId) {
        return accountRepository.findById(accountId).get();
    }

    public List<Accounts> getAccountsByUser(String param) {
        return null;
    }

    
}