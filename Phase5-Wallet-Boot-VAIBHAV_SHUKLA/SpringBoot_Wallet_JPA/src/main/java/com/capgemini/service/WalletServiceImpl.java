package com.capgemini.service;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Customer;
import com.capgemini.bean.Wallet;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientAmountException;
import com.capgemini.exception.MobileNoDoesNotExistException;
import com.capgemini.repo.WalletRepo;

@Service
public class WalletServiceImpl implements WalletService {
	
	@Autowired
	WalletRepo walletRepo;
	
	public WalletServiceImpl(WalletRepo walletRepo) {
		super();
		this.walletRepo = walletRepo;
	}
	
	Customer customer;
	Wallet w;
	int counter=1;
	
	@Override
	public Customer createAccount(String name, String mobileNo, BigDecimal amount) throws DuplicateMobileNumberException 
	{
		if(walletRepo.existsById(mobileNo)) {
			throw new DuplicateMobileNumberException();
		}
		customer=new Customer();
		customer.setName(name);
		customer.setMobileNo(mobileNo);
		w=new Wallet();
		w.setBalance(amount);
		customer.setWallet(w);
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public Customer showBalance(String mobileNo) throws MobileNoDoesNotExistException
	{
		if(walletRepo.findById(mobileNo)==null)
			throw new MobileNoDoesNotExistException();
		System.out.println(walletRepo.findById(mobileNo));
		customer = walletRepo.findById(mobileNo).get();
		return customer;
	}

	@Override
	public List<Customer> fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException 
	{
		Customer customer1=new Customer();
		List<Customer> list=new LinkedList<>();
		customer1=walletRepo.findById(sourceMobileNo).get();
		if(customer1!=null) {
			Customer customer2=new Customer();
			customer2=walletRepo.findById(targetMobileNo).get();
			if(customer2!=null) {
				list.add(withdrawAmount(sourceMobileNo, amount));
				list.add(depositAmount(targetMobileNo, amount));
			}	
		}
		return list;
	}
	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) throws MobileNoDoesNotExistException
	{
		customer=showBalance(mobileNo);
		w=customer.getWallet();
		w.setBalance(w.getBalance().add(amount));
		customer.setWallet(w);
		walletRepo.save(customer);
		
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException
	{
		
		customer=showBalance(mobileNo);
		w=customer.getWallet();
		if(w.getBalance().compareTo(amount)==-1)
			throw new InsufficientAmountException();
		w.setBalance(w.getBalance().subtract(amount));
		customer.setWallet(w);
		walletRepo.save(customer);
		
		return customer;
	}

	
}
