package exceptionhandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "you are too young,have patience";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "you are too old,sorry";
	}
}

class Applicant{
	int age;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age ");
		age = scan.nextInt();
	}
	public void verify()throws UnderAgeException,OverAgeException {
		if(age>=18 && age<=60) {
			System.out.println("collect your License");
		}
		else if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		
		else {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}

class Rto{
	public void validate() {
		Applicant a = new Applicant();
		a.acceptInput();
		try {
			a.verify();
		}
		catch(Exception e1) {
			System.out.println("You Will not License");
		}
	}
}

public class CustomE2 {
	public static void main(String[] args) {
		Rto rto = new Rto();
		rto.validate();
	}
}

