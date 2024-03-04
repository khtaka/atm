package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "accounts")
public class Account {

    @Id
    @SequenceGenerator(name = "ACCOUNT_ID_GENERATOR", sequenceName = "ACCOUNT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="ACCOUNT_ID_GENERATOR")
    @Column(name = "id")
    private Integer id;

    @Column(name = "amount")
    private Integer amount;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}