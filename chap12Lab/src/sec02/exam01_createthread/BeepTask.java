package sec02.exam01_createthread;

import java.awt.Toolkit;

// Runnable �������̽��� ���� Ŭ����
public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);  // 0.5��
			} catch (Exception e) {
			}
		}
	}
}
