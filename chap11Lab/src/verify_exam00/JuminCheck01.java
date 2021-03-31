package verify_exam00;

import java.util.Scanner;

public class JuminCheck01 {

	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	public boolean juminCheck(String jumin) {
		// �ۼ���ġ
		int total = 0 ;
		int total2;
		int[] mul = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		// 1. �ֹ� ��ȣ �� �ڸ��� �ش� ���ڸ� ���Ѵ�.
		for(int i=0; i<12; i++) {
				total += Integer.parseInt(jumin.substring(i, i+1)) *mul[i];
		}
		// 2. 1���� ���� ����� 11�� ����� �������� ���Ѵ�.
		total %= 11;

		// 3. 11���� ������ ���� ���� ��üũ�� ��ȣ�͡��� ���ؼ� ������ 
		//      �ùٸ� �ֹι�ȣ, �׷��� ������ Ʋ�� �ֹ� ��ȣ
		// 4. ����, �������� 10�̻��̸�, �ٽ� 10���� ����� �� �������� üũ�� ��ȣ�� ���Ѵ�.
		total2 = 11 - total;
		if(total2 > 9 ) {
			total2 %= 10;
		}
		if(total2 != Integer.parseInt(jumin.substring(12,13))) {
			return false;
		}else {
			return true;
		}	
		
	}

	public static void main(String[] args) {

		JuminCheck01 jc = new JuminCheck01();
		
		// �ֿܼ��� ������ �Է��� �� �ִ� Scanner �����Ѵ�.
		//InputStream is = System.in;
		Scanner sc = new Scanner(System.in);  

		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 780331
		
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1011342

		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {  // "7803311011342"
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
	}

}
