package com.cg.mra.dao;

import com.cg.mra.beans.Account;

public interface AccountDao {
	
	
	public Account getAccountDetails(String mobileNo);
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
	

}
