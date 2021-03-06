package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
		);
		
		Stream<Student> stream = list.stream();
		
		// 익명구현객체를 매개변수로 사용한다.
		/*stream.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student s) {
				String name = s.getName();
				int score = s.getScore();
				System.out.println(name + "-" + score);
			}
		});*/
		
		
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
