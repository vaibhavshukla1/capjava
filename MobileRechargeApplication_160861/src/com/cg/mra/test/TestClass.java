package com.cg.mra.test;

import static org.junit.Assert.*;



import javax.security.auth.login.AccountException;
import org.junit.Test;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class TestClass {
	
	public TestClass() {
			// TODO Auto-generated constructor stub
	}

	@Test(expected=AccountException.class)
	public void ValidateMobileNumber_v1() throws AccountException {
		AccountService accservice=new AccountServiceImpl();
		accservice.validatemobNo(null);
		
	}
	@Test
	public void ValidateMobileNumber_v2() throws AccountException  { //less than 10digits
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validatemobNo("62");
		assertEquals(false, result);
		
	}
	
	@Test
	public void ValidateMobileNumber_v3() throws AccountException  { //not number digits
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validatemobNo("jhsgdjg");
		assertEquals(false, result);
		
	}
	@Test
	public void ValidateMobileNumber_v4() throws AccountException  { // correct format
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validatemobNo("6985231470");
		assertEquals(true, result);
		
	}
	@Test
	public void ValidateMobileNumber_v5() throws AccountException  {
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validatemobNo("78965412023"); // greater than 10 digits
		assertEquals(false, result);
		
	}
	
	@Test
	public void ValidateRechargeAmount_v1() throws AccountException  {
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validateReAmount(-25); // negative recharge amount
		assertEquals(false, result);
		
	}
	
	@Test
	public void ValidateRechargeAmount_v2() throws AccountException  {
		AccountService accservice=new AccountServiceImpl();
		boolean result=accservice.validateReAmount(100); // correct recharge amount format
		assertEquals(true, result);
		
	}
	
	@Test(expected=AccountException.class)
	public void ValidateRechargeAmount_v3() throws AccountException {
		AccountService accservice=new AccountServiceImpl();
		accservice.validateReAmount(0);
		
	}
	
	

}
