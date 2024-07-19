package com.wecp.progressive.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class CreditCard {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    // private Long id;

    // private String cardNumber;
    // private String cardHolderName;
    
    public CreditCard() {
    }

    // public CreditCard(String cardNumber, String cardHolderName) {
    //     this.cardNumber = cardNumber;
    //     this.cardHolderName = cardHolderName;
    // }

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getCardNumber() {
    //     return cardNumber;
    // }

    // public void setCardNumber(String cardNumber) {
    //     this.cardNumber = cardNumber;
    // }

    // public String getCardHolderName() {
    //     return cardHolderName;
    // }

    // public void setCardHolderName(String cardHolderName) {
    //     this.cardHolderName = cardHolderName;
    // }

    private long id;

    private String cardNumber;
    private String cardHolderName;
    
    public CreditCard(long id, String cardNumber, String cardHolderName) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    

    
}