package com.wecp.progressive.repository;
import com.wecp.progressive.entity.Transactions;

import java.util.List;

import javax.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction,Long> {
    @Query("select t from Transactions t where t.customers.customer_id = :customer_id")
    public List<Transactions> getAllTransactionsByCustomerId(int customer_id);
}
