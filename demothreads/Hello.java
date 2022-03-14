package demothreads;

public class Hello extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello there");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}

	}
}
