package sec06.exam06_stop;

// main Thread 실행
public class InterruptExample {
	public static void main(String[] args)  {
		// 작업 Thread 실행
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
