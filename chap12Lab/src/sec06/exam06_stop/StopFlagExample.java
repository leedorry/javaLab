package sec06.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args)  {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//printThread.stop();  비정상적으로 끝남
		printThread.setStop(true);
	}
}

