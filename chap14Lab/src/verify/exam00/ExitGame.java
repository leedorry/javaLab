package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sc[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("���� �Է� : ");
			sc[i] = scanner.nextInt();
			sum += sc[i];
			System.out.println("�Է� : " + sc[i] + ", " +"�� : " + sum);
			if(sum >= 100) {
				System.out.println("���α׷� ����!");
				break;
			}
		}
	}

}
