package verify.exam00;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		avg = (double) sum / 100;
		
		System.out.println("1~100  �հ� : " + sum);
		System.out.print("��� : ");
		System.out.printf("%.2f", avg);
		System.out.println();
		
		// ���콺 ���� : n~m�� �� = (n+m)(n���� m������ ���� ����)/2
		// ��) 1~100�� �� = (1+100)*(100)/2 = 5050
		int num = 100;
		int sum2 = (1+num)*num/2;
		double avg2 = (double)sum / num;
		
		System.out.println("1~100  �հ� : " + sum2);
		System.out.print("��� : " + avg2);
		
	}

}
