package BankApplication;

import java.util.Scanner;

public class BankMainClass {
	
	static  Scanner scannerObject = new Scanner(System.in);

	public static void main(String[] args) throws BankExceptionMessage {
		boolean find = false;	
    
		
		System.out.println("enter the customer count");
		 int customerCount = scannerObject.nextInt();
		 
		 
		 
		 AccountDetails accountDetails[] = new AccountDetails[customerCount];
		
		 int option;
		do {
		 
		 System.out.println("1. create acc");
		 
		 System.out.println("2.show all acc");
		 
		 System.out.println("3.find acc");
		 
		 System.out.println("4.available bala");
		 
		 System.out.println("5.deposit balance");
		 
	
		 System.out.println("6.withdraw balance");

		 
		 System.out.println("enter the option");
		 option = scannerObject.nextInt();
		 
		switch (option) {
		case 1:
			 for (int i = 0; i < accountDetails.length; i++) {
				 
				 accountDetails[i] = new AccountDetails();
				 
				 accountDetails[i].createAccount();			
			}
			break;
		case 2:
			int	 findAccountNumber1 ;
			System.out.println("enter the find account number :");
			  findAccountNumber1 = scannerObject.nextInt();
			
			
			for (int i = 0; i < accountDetails.length; i++) {
				 
				 find = accountDetails[i].isSearchAccountNumber(findAccountNumber1);
			      if(find) {
			         accountDetails[i].showAccountDetails();		
			  }
			      if(!find) {
			          throw new BankExceptionMessage("account not found");
			   }
			      
			 
			 }
			break;
			 
		case 3:
			
			System.out.println("enter the find account number :");
			int  findAccountNumber2 = scannerObject.nextInt();
			
			for (int i = 0; i < accountDetails.length; i++) {
				 
				 find = accountDetails[i].isSearchAccountNumber(findAccountNumber2);
			      if(find) {
			         accountDetails[i].showBalance();		
			  }
			      
			}
			break;
			
			
			
		case 4:
			System.out.println("enter the find account number :");
			int  findAccountNumber3 = scannerObject.nextInt();
			for (int i = 0; i < accountDetails.length; i++) {
	    		 
	    		 find = accountDetails[i].isSearchAccountNumber(findAccountNumber3);
	    	      if(find) {
	    	    	  
	    	         accountDetails[i].withdrawBalance();		
	    	  }
	    	      if(!find) {
	    	          throw new BankExceptionMessage("account not found");
	    	   }
			}
			
			break;
		case 5:
			System.out.println("enter the find account number :");
			int  findAccountNumber4 = scannerObject.nextInt();
			 for (int i = 0; i < accountDetails.length; i++) {
	    		 
	    		 find = accountDetails[i].isSearchAccountNumber(findAccountNumber4);
	    	      if(find) {
	    	    	  
	    	         accountDetails[i].DepositBalance();		
	    	  }
	    	      if(!find) {
	    	          throw new BankExceptionMessage("account not found");
	    	   }
	    	break;
			 }
		default:
			System.out.println("system error");
			
		} 
	
		
	
		
		}
		while(option != 5);
	 
		}
	
		 
}
		 
		 
		 