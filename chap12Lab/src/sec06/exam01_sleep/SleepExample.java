package sec06.exam01_sleep;

import java.awt.Toolkit;

// main Thread�� main()�޼ҵ带 �����Ų��.
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); 
				// Thread.sleep()�� �ڽ��� �����带 �Ͻ� ���� ���·� �����.
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
