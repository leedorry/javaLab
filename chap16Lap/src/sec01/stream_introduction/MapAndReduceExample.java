package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);		
			
		double avg = studentList.stream()
			//�߰�ó��(�л� ��ü�� ������ ����)
			
			// �͸�����ü�� �Ű������� ����Ѵ�.
			/*.mapToInt(new ToIntFunction<Student>() {
				@Override
				public int applyAsInt(Student s) {
					return s.getScore();
				}
			})*/
			
			// ���ٽ�
			//.mapToInt(s -> s.getScore())
				
			// �Ű������� �޼ҵ� ����
			.mapToInt(Student :: getScore)  // Stream<Student> -> intStream
			
			//���� ó��(��� ����)
			.average()
			.getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}
}
