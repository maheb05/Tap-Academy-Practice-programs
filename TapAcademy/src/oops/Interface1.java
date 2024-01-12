package oops;

import java.util.Scanner;

interface Calculator{
	public abstract void add();
	public abstract void sub();
}

class MyCalc1 implements Calculator{
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println(a-b);
	}
}

class MyCalc2 implements Calculator{
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("Enter b value ");
		int b = sc.nextInt();
		System.out.println(a+b);
	}
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("Enter b value ");
		int b = sc.nextInt();
		System.out.println(a-b);
	}
}

class MyCalc3 implements Calculator{
	public void add() {
		System.out.println(200+400);
	}
	public void sub() {
		System.out.println(400-200);
	}
}

class Math{
	public void Perform(Calculator ref) {
		ref.add();
		ref.sub();
	}
}


public class Interface1 {
	public static void main(String[] args) {
		
		MyCalc1 m1 = new MyCalc1();
		MyCalc2 m2 = new MyCalc2();
		MyCalc3 m3 = new MyCalc3();
		
		Math m = new Math();
		m.Perform(m1);
		System.out.println();
		m.Perform(m2);
		System.out.println();
		m.Perform(m3);
	}
}
