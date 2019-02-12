package com.cg.mra.service;

import javax.security.auth.login.AccountException;

import com.cg.mra.beans.Account;

public interface AccountService {
	
	public Account getAccountDetails(String mobileNo);
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
	public boolean validatemobNo(String mobNo) throws AccountException;
	public boolean validateReAmount(double recAmount) throws AccountException;
	

}
