package com.capgemini.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Customer;
import com.capgemini.exception.DuplicateMobileNumberException;
import com.capgemini.exception.InsufficientAmountException;
import com.capgemini.exception.MobileNoDoesNotExistException;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	WalletServiceImpl walletServiceImpl;
	
	Customer customer;
	
	@RequestMapping(method=RequestMethod.POST, value="/addCustomer/{name}/{mobileNo}/{balance}")
	public Customer createAccount(@PathVariable  String name,@PathVariable String mobileNo,@PathVariable BigDecimal balance ) throws DuplicateMobileNumberException 
	{
		
		return walletServiceImpl.createAccount(name, mobileNo,balance);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getBalance/{mobileNo}")
	
	public Customer showBalance(@PathVariable String mobileNo) 
	{
		try {
		return walletServiceImpl.showBalance(mobileNo);}
		catch(MobileNoDoesNotExistException ex) {
			System.out.println("Mobile Number does not exist");
		}
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/depositBalance/{mobileNo}/{amount}")
		
		public Customer depositBalance(@PathVariable String mobileNo ,@PathVariable BigDecimal amount) throws MobileNoDoesNotExistException {
			return walletServiceImpl.depositAmount(mobileNo, amount);
		
		}
		
	
	@RequestMapping(method=RequestMethod.POST, value="/withdrawBalance/{mobileNo}/{amount}")

		public Customer withdrawBalance(@PathVariable String mobileNo ,@PathVariable BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException 
	{
		return walletServiceImpl.withdrawAmount(mobileNo, amount);
		
			 
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/fundTransfer/{sourceMobileNo}/{targetMobileNo}/{amount}")

	public List<Customer> fundTransfer(@PathVariable String sourceMobileNo ,@PathVariable String targetMobileNo ,@PathVariable BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException 
{
		
		return walletServiceImpl.fundTransfer(sourceMobileNo, targetMobileNo, amount);
		
}
	

}




