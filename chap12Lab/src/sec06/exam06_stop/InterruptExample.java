package sec06.exam06_stop;

// main Thread ����
public class InterruptExample {
	public static void main(String[] args)  {
		// �۾� Thread ����
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
