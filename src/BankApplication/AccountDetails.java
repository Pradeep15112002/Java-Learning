package BankApplication;

import java.util.Scanner;

public class AccountDetails {

	private String customerName;
	private String bankAccountType;
	private Integer bankAccountNumber;
	private Integer availableBalance;
	 static Scanner enterValue = new Scanner(System.in); 
	
	public void createAccount() {
		
		System.out.println("enter the customerName");
		customerName =  enterValue.nextLine();
		
		System.out.println("enter bankAccountType");	
		bankAccountType = enterValue.nextLine();
		
		System.out.println("enter bankAccountNumber");
		bankAccountNumber = enterValue.nextInt();
		
		System.out.println("enter availableBalance");
		availableBalance = enterValue.nextInt();
	
		
	
	}
	
	public void showAccountDetails() {
		System.out.println("customer name : " + customerName);
		System.out.println("bankAccountType :" + bankAccountType);
		System.out.println("bankAccountNumber :" +  bankAccountNumber);
		System.out.println("availableBalance : " + availableBalance );
		
	}

	public boolean isSearchAccountNumber(int searchAccNumber) {
		
		if(bankAccountNumber == searchAccNumber) {
			return true;
		}
		return false;
		
	}
	
	
	public void showBalance() {
		System.out.println("available balance" + availableBalance );
	}
	
	
	
	public void DepositBalance() {	
		System.out.println("enter depositBalance");
	int	depositBalance = enterValue.nextInt();
	availableBalance = availableBalance+depositBalance;
	
		System.out.println(" depositBalance after avail balance :" + availableBalance);
	
	}
	
	public void withdrawBalance() {	
		System.out.println("enter withdrawBalance");
	int	withdrawBalance = enterValue.nextInt();
	withdrawBalance = availableBalance+withdrawBalance;
	
		System.out.println(" WithdrawBalance after avail balance :" + availableBalance);
	
	}
	
	
	
}
