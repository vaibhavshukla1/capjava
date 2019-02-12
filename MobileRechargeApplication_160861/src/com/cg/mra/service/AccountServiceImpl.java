package com.cg.mra.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.security.auth.login.AccountException;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	
	AccountDao dao;
	public AccountServiceImpl() {
		dao=new AccountDaoImpl();
	}
	

	@Override
	public Account getAccountDetails(String mobileNo) {
		
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}


	@Override
	public boolean validatemobNo(String mobNo) throws AccountException {
		if(mobNo==null)
			throw new AccountException("Number connot be zero");
		Pattern pat=Pattern.compile("[6-9]{1}[0-9]{2,9}");
		Matcher mat=pat.matcher(mobNo);
		return mat.matches();
	
	}


	@Override
	public boolean validateReAmount(double recAmount) throws AccountException {
		if(recAmount>0){
			return true;
		}
		else if(recAmount==0)
		{
			throw new AccountException("Recharge Amount cannot be zero");
		}
		return false;
	}

}
