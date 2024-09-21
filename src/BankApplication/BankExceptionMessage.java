package BankApplication;

public class BankExceptionMessage extends Exception {
	


	String message;
	

	public BankExceptionMessage(String message) {
		
		this.message = message;
	}

	
	@Override
	public String toString() {
		return "BankExceptionMessage [message=" + message + "]";
	}
}
