package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sc[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자 입력 : ");
			sc[i] = scanner.nextInt();
			sum += sc[i];
			System.out.println("입력 : " + sc[i] + ", " +"합 : " + sum);
			if(sum >= 100) {
				System.out.println("프로그램 종료!");
				break;
			}
		}
	}

}
