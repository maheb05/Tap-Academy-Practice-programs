package exceptionhandling;
import java.util.*;
class InvalidUserException extends Exception{
	public String getMessage() {
		return "Invalid User details,try Again.....Check your Account Number And Pin";
	}
}

class Atm{
	private int pin = 12345;
	private int accno = 67890;
	private int p;
	private int acc;
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number");
		acc = scan.nextInt();
		System.out.println("Enter Pin");
		p = scan.nextInt();
	}
	
	public void verify() throws Exception {
		if(p==pin && acc==accno) {
			System.out.println("Collect your cash");
		}
		else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}

class Bank{
	public void validate() {
		Atm atm = new Atm();
		try {
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception e1) {
			try {
				atm.acceptInput();
				atm.verify();
			}
			catch(Exception e2) {
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception e3) {
					System.out.println("Card Blocked Due to So Many Attempts");
				}
			}
		}
	}
}

public class CustomException {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.validate();
	}

}
