package oops;

import java.util.Scanner;

public class Inheritance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.cargoplane();
		
		System.out.println();
		
		Passsenger pp = new Passsenger();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.passengerplane();
		
		System.out.println();
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.fighterplane();
		
	}

}

class Plane{
	
	void takeOff() {
		System.out.println("-->Plane is Taking Off ");
	}
	
	void fly() {
		System.out.println("Plane is Flying ");
	}
	void land() {
		System.out.println("-->Plane is landing");
	}
}

class CargoPlane extends Plane{
	
	void fly() {
		System.out.println("$ CargoPlane if Flying in very low height because it contains Goods");
	}
	
	void cargoplane() {
		System.out.println("* It is used for transport purpose ");
	}
	
}

class Passsenger extends Plane{
	
	void fly() {
		System.out.println("$ Passenger plane is Flying Above the Medium height");
	}
	
	void passengerplane() {
		System.out.println("* Passengers are there in to travel one place to another place");
	}
}

class FighterPlane extends Plane{
	void fly() {
		System.out.println("$ Fighter planes flyies More Height than others");
	}
	
	void fighterplane() {
		System.out.println("* It can be used in Battle Fields");
	}
}
