package multiThreading;
/////OVERCOMING DEADLOCK SITUATION
class Family implements Runnable{
	
	String resource1 = "PlayStation";
	String resource2 = "ConTroller";
	
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
		synchronized(resource1) {
			try {
				System.out.println("Rohit Aquired playstation");
				Thread.sleep(1000);
				synchronized(resource2) {
					System.out.println("rohit aquired Controller");
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e) {
				System.out.println("Something Went Wrong");
			}
		}
		
	}
	
	void vijay() {
		synchronized(resource1) {
			try {
				System.out.println("vijay aquired playstation");
				Thread.sleep(1000);
				synchronized(resource2) {
					System.out.println("Vijay acquired controller");
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException e) {
				System.out.println("Something Went Wrong");
			}
		}
	}
}

public class DeadLock {
	public static void main(String[] args) {
		Family f = new Family();
		
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("Rohit");
		t2.setName("Vijay");
		
		t1.start();
		t2.start();
	}
}
