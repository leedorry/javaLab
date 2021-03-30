package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "���̵�,�̸�,�н�����";
		
		// �ۼ� ��ġ
		
		// #1: split() �޼ҵ� �̿�
		String[] results = str.split(",");
		for(String result : results) {
			System.out.println(result);
		}
		System.out.println();
		
		// #2: StringTokenizer �̿�
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
