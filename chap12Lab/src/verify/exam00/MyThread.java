package verify.exam00;

// Thread Ŭ������ ����� ���� Ŭ������ ����
// �ۼ� ��ġ
public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("T");
		}
	}
}
