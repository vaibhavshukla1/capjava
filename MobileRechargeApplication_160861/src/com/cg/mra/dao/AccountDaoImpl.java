package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {
	
	Map<String, Account> accountEntry;
	
	public AccountDaoImpl() {
		
	accountEntry=new HashMap<String, Account>();
	
	accountEntry.put("9010210131", new Account("Prepaid", "Vaishali",200));
	accountEntry.put("9823920123", new Account("Prepaid", "Megha",453));
	accountEntry.put("9932012345", new Account("Prepaid", "Vikas",631));
	accountEntry.put("9010210132", new Account("Prepaid", "Anju", 521));
	accountEntry.put("9010210133", new Account("Prepaid", "Tushar",632));
	
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		
		if(accountEntry.containsKey(mobileNo))
			return accountEntry.get(mobileNo);
	
	return null;
	}
	
	

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		double balance=0;
		if(accountEntry.containsKey(mobileNo)){
			Account acc= accountEntry.get(mobileNo);
			   balance= rechargeAmount+acc.getAccountBalance();
			acc.setAccountBalance(balance);
		}
		
		// TODO Auto-generated method stub
		
		return balance;
	}

}
