package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()  // ��Ʈ�� ��´�.
			// �߰� ó��
				/*.filter(new Predicate<Member>() {
					@Override
					public boolean test(Member m) {
						return m.getSex()==Member.MALE;
					}
				})*/
			.filter(m -> m.getSex()==Member.MALE)  // �߰�ó��, ���͸� : ���(���ڸ�) <- ���(��ü)
			/*.mapToInt(new ToIntFunction<Member>() {
				@Override
				public int applyAsInt(Member m) {
					return m.getAge();
				}
			})*/
			//.mapToInt(m -> m.getAge()) // ���ٽ�
			.mapToInt(Member :: getAge)  // �Ű����� �޼ҵ� ����, ��Ī int <- Member
			.average()  // ���� ó��
			.getAsDouble();
		
		System.out.println("���� ��� ����: " + ageAvg);
	}
}


