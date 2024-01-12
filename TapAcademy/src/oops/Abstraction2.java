package oops;

abstract class Bird{
	abstract void eat();
	abstract void fly();
}

abstract class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle Flies at great heigth ");
	}
}

class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golgen Eagle eats birds ");
	}
}

class SaptenEagle extends Eagle{
	void eat() {
		System.out.println("Sapten Eagle eats fishes");
	}
}

class AboutBird{
	
	void know(Bird b) {
		b.eat();
		b.fly();
	}
}

public class Abstraction2 {
	public static void main(String[] args) {
		
		GoldenEagle g = new GoldenEagle();
		SaptenEagle s = new SaptenEagle();
		
		AboutBird a = new AboutBird();
		a.know(g);
		a.know(s);
		
	}

}
