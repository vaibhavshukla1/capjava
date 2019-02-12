package com.cg.mra.ui;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

import com.cg.mra.beans.Account;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	static Scanner sc;
	public static void main(String[] args) throws AccountException {
		
		AccountService service=new AccountServiceImpl();
		sc=new Scanner(System.in);
		int ch=0;
		do{
			
			System.out.println("\n1) Account Balance Enquiry ");
			System.out.println("2) Recharge Account ");
			System.out.println("3) Exit ");
			
			ch=sc.nextInt();
			switch(ch){
			
			case 1:
				System.out.println("Enter Mobile No : ");
				String mobileNo=sc.next();
				if(service.validatemobNo(mobileNo)){
					Account acc=service.getAccountDetails(mobileNo);
					if(acc==null)
						System.out.println("Given Account Id Does Not Exits ");
					else
						System.out.println("Your Current Balance is Rs. "+acc.getAccountBalance());
				}
				
				else
					System.out.println("Enter 10 digit Mobile Number");
				
				break;
				
			case 2:
				System.out.println("Enter MobileNo : ");
				String mobNo=sc.next();
				System.out.println("Enter Recharge Amount : ");
				double amount=sc.nextDouble();
				if(service.validatemobNo(mobNo))				 												//if no.1 for validating mobile number =
				{
					if(amount==0){																				//if no.2 for ensuring recharge amount cannot be zero
						System.out.println("Recharge amount cannot be zero");
					}																							//end of if no.2
					else if(service.validateReAmount(amount))													//else if for validating recharge amount
					{
						double newbalance=service.rechargeAccount(mobNo, amount);
						if(newbalance==0){																		//if no.3 method returns 0 if no mobile number is existing 
						System.out.println("Cannot Recharge Account as Given Mobile No Does Not Exists ");
						}																						//end of if no.3
						else{	
						Account acc1=service.getAccountDetails(mobNo);
						System.out.println("Your Account Recharged Successfully");
						System.out.println("Hello "+acc1.getCustomerName()+",Available Balance is "+newbalance+".");
						}
					}																							//end of else if
					else
						System.out.println("enter valid Recharge Amount");
					
				
					
				}																								// end of if no.1
				else
					System.out.println("Enter 10 digit Mobile Number");
				
				
				break;
			
			
			
			}
			
			
			
		}while(ch!=3);
		
		
		

	}

}
