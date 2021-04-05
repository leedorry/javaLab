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
		
		System.out.println("1~100  ÇÕ°è : " + sum);
		System.out.print("Æò±Õ : ");
		System.out.printf("%.2f", avg);
	}

}
