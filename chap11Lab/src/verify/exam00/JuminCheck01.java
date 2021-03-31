package verify.exam00;

import java.util.Scanner;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck(String jumin) {
		// 작성위치
		int total = 0 ;
		int total2;
		int[] mul = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		// 1. 주민 번호 각 자리에 해당 숫자를 곱한다.
		for(int i=0; i<12; i++) {
				total += Integer.parseInt(jumin.substring(i, i+1)) *mul[i];
		}
		// 2. 1번의 연산 결과를 11로 나누어서 나머지를 구한다.
		total %= 11;

		// 3. 11에서 나머지 값을 뺀후 “체크용 번호와”와 비교해서 같으면 
		//      올바른 주민번호, 그렇지 않으면 틀린 주민 번호
		// 4. 만약, 연산결과가 10이상이면, 다시 10으로 나누어서 그 나머지를 체크용 번호와 비교한다.
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
		
		// 콘솔에서 데이터 입력할 수 있는 Scanner 생성한다.
		//InputStream is = System.in;
		Scanner sc = new Scanner(System.in);  

		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 780331
		
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1011342

		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {  // "7803311011342"
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}

}
