package sec06.exam03_join;

public class JoinExample {
	// main 스레드가 실행
	public static void main(String[] args) {
		// 작업 스레드를 생성
		SumThread sumThread = new SumThread();
		// 작업 스레드가 실행
		sumThread.start();
		try {
			// main 스레드가 작업 스레드가 완료될 때까지 일시 정지 상태로 있는다.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

