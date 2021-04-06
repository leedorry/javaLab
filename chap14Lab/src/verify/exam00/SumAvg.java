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
		
		System.out.println("1~100  합계 : " + sum);
		System.out.print("평균 : ");
		System.out.printf("%.2f", avg);
		System.out.println();
		
		// 가우스 공식 : n~m의 합 = (n+m)(n부터 m까지의 수의 개수)/2
		// 예) 1~100의 합 = (1+100)*(100)/2 = 5050
		int num = 100;
		int sum2 = (1+num)*num/2;
		double avg2 = (double)sum / num;
		
		System.out.println("1~100  합계 : " + sum2);
		System.out.print("평균 : " + avg2);
		
	}

}
