package verify.exam00;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		System.out.println((num > 0) ? "양수" : ((num < 0) ? "음수" : "0"));
	}

}
