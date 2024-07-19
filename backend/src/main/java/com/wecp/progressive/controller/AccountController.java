package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Accounts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accounts")
public class AccountController {


    @GetMapping
    public ResponseEntity<List<Accounts>> getAllAccounts() {
        return null;
    }

    
    @GetMapping("/{accountId}")
    public ResponseEntity<Accounts> getAccountById(int accountId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Accounts>> getAccountsByUser(String param) {
        return null;
    }

    @PostMapping
    public ResponseEntity<Integer> addAccount(Accounts accounts) {
        return null;
    }

    @PutMapping("/{accountId}")
    public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts) {
        return null;
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(int accountId) {
        return null;
    }
}