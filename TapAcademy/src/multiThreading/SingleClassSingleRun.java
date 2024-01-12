package multiThreading;

import java.util.Scanner;

class SingleRun implements Runnable{
	public void run() {
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if(name.equals("ADD")) {
			add();
		}
		else if(name.equals("NUM")) {
			printNum();
		}
		else {
			printChar();
		}
		
	}
	
	void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		System.out.println("Enter b value");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	
	void printNum() {
		System.out.println("Printing Numbers");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Somethiing Went Wrong");
			}
		}
		System.out.println("Number Printing Ended");
	}
	
	void printChar() {
		System.out.println("Printing Charceters");
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Something Went Wrong");
			}
		}
		System.out.println("Printing Charecters Ended");
	}
}



public class SingleClassSingleRun {
	public static void main(String[] args) {
		SingleRun sr = new SingleRun();
		
		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);
		
		t1.setName("ADD");
		t2.setName("NUM");
		t3.setName("CHAR");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
