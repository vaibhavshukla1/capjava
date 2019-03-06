package com.capgemini.service;

import java.math.BigDecimal;
//import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.capgemini.bean.Customer;
//import com.Wallet.bean.Transaction;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientAmountException;
import com.capgemini.exception.MobileNoDoesNotExistException;

public interface WalletService {

	public Customer createAccount(String name,String mobileNo,BigDecimal amount) throws DuplicateMobileNumberException;
	public Object showBalance(String mobileNo) throws MobileNoDoesNotExistException;
	public List<Customer> fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount) throws MobileNoDoesNotExistException,InsufficientAmountException;
	public Customer depositAmount(String mobileNo,BigDecimal amount) throws MobileNoDoesNotExistException;
	public Customer withdrawAmount(String mobileNo,BigDecimal amount)throws MobileNoDoesNotExistException,InsufficientAmountException;
	
	
	
}
