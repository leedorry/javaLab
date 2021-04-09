package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 90),
				new Student("�ſ��", 92)
		);
		
		Stream<Student> stream = list.stream();
		
		// �͸�����ü�� �Ű������� ����Ѵ�.
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
