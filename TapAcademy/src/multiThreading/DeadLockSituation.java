package multiThreading;
///////// DEADLOCK OCCURED....
class Fami implements Runnable{
	
	String resource1 = "playstation";
	String resource2 = "Controller";
	
	
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Rohit")==true) {
			rohit();
		}
		else {
			vijay();
		}
	}
	
	void rohit() {
		synchronized(resource2){
			try {
				System.out.println("Rohit Aquired Controller");
				Thread.sleep(1000);
				synchronized(resource1) {
					System.out.println("Rohit Aquired playstation");
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e) {
				System.out.println("Something went wrong");
			}
		}
	}
	
	void vijay() {
		synchronized(resource1) {
			try {
				System.out.println("vijay Aquired playstation");
				Thread.sleep(1000);
				synchronized(resource2) {
					System.out.println("Vijay Aquired controller");
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e) {
				System.out.println("Something wennt Wrong");
			}
		}
	}
}

public class DeadLockSituation {
	public static void main(String[] args) {
		Fami f = new Fami();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("Rohit");
		t2.setName("Vijay");
		
		t1.start();
		t2.start();
	}
}
