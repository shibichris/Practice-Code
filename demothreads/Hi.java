package demothreads;

public class Hi extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hi buddy");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}

}
