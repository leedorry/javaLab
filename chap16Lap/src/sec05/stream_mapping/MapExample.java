package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);
			
		studentList.stream()
			/* �͸�����ü
			.mapToInt(new ToIntFunction<Student>() {
				@Override
				public int applyAsInt(Student s) {
					return s.getScore();
				}
			})*/
			//.mapToInt(s -> s.getScore())  // ���ٽ�
			.mapToInt(Student :: getScore)  // �Ű������� �޼ҵ� ����, �߰�ó�� : ����(Student -> IntStream)
			.forEach(score -> System.out.println(score));
	}
}
