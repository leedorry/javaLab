package sec03.exam06_finalize;

public class Counter {
	// 필드
	private int no;
	
	// 생성자
	public Counter(int no) {
		this.no = no;
	}

	// 메소드
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
