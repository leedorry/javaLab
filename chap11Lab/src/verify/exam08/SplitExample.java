package verify.exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "아이디,이름,패스워드";
		
		// 작성 위치
		
		// #1: split() 메소드 이용
		String[] results = str.split(",");
		for(String result : results) {
			System.out.println(result);
		}
		System.out.println();
		
		// #2: StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
