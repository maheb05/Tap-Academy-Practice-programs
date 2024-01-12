package oops;

class PPlane{
	void takeOff() {
		System.out.println("plane is Taking OFF");
	}
	
	void fly() {
		System.out.println("Plane is Flying");
	}
	
	void land() {
		System.out.println("Plane is Landing");
	}
}

class OargoPlane extends PPlane{
	
	void takeOff() {
		System.out.println("Cargo Plane is Taking OFF");
	}
	
	void fly() {
		System.out.println("Its Flying Average Height");
	}
	
	void land() {
		System.out.println("It is Landing");
	}
	
	void carry() {
		System.out.println("It carry's Goods");
	}
}

class PassengerPlane extends PPlane{
	
	void takeOff() {
		System.out.println("Passenger Plane is Taking OFF");
	}
	
	void fly() {
		System.out.println("Its Flying Medium Height");
	}
	
	void land() {
		System.out.println("It is Landing");
	}
	
	void carry() {
		System.out.println("It carry's Passengers");
	}
}

class OFighterPlane extends PPlane{
	
	void takeOff() {
		System.out.println("Fighter Plane is Taking OFF");
	}
	
	void fly() {
		System.out.println("Its Flying Great Height");
	}
	
	void land() {
		System.out.println("It is Landing");
	}
	
	void carry() {
		System.out.println("It carry's Fighters");
	}
}

class Airport{
	void permit(PPlane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		
		OargoPlane cp = new OargoPlane();
		PassengerPlane pp = new PassengerPlane();
		OFighterPlane fp = new OFighterPlane();
		
		Airport a = new Airport();
		a.permit(cp);
		((OargoPlane)(cp)).carry();
		System.out.println();
		
		a.permit(pp);
		((PassengerPlane)(pp)).carry();
		System.out.println();
		
		a.permit(fp);
		((OFighterPlane)(fp)).carry();
		
	}

}
