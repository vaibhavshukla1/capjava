package com.capgemini.bean;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
//import javax.persistence.Entity;
//import javax.persistence.Table;

@Embeddable
public class Wallet {
@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
private BigDecimal balance;
public BigDecimal getBalance() {
	return balance;
}
public void setBalance(BigDecimal balance) {
	this.balance=balance;
}
}
