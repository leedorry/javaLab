package verify.exam08;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			
			// �ۼ� ��ġ
			if(this.isInterrupted()){
				break;
			}
		}
	}
}

