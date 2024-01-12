package oops;

import java.util.Scanner;

abstract class Shape{
	
	float area;
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea() {
		System.out.println("Area is "+area);
	}
}

class Square extends Shape{
	
	Scanner sc = new Scanner(System.in);
	private float side;
	
	public void acceptInput() {
		System.out.println("Enter Square Side ");
		side = sc.nextFloat();
	}
	
	public void calcArea() {
		area = side * side;
	}
}

class Rectangle extends Shape{
	
	Scanner sc =  new Scanner(System.in);
	private float length;
	private float breadth;
	
	public void acceptInput() {
		System.out.println("enter rectangle Length ");
		length = sc.nextFloat();
		System.out.println("enter rectangle breadt ");
		breadth = sc.nextFloat();
	}
	
	public void calcArea() {
		area = length * breadth;
	}
}

class Circle extends Shape{
	Scanner sc = new Scanner(System.in); 
	private float radius;
	
	public void acceptInput() {
		System.out.println("Enter circle radius ");
		radius = sc.nextFloat();
	}
	
	public void calcArea() {
		area = 3.141f * radius * radius;
	}
}

class Print{
	
	public void permit(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}


public class Abstraction {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Print p = new Print();
		p.permit(s);
		p.permit(r);
		p.permit(c);
		
	}

}
