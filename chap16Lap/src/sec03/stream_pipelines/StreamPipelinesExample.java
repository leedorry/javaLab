package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()  // 스트림 얻는다.
			// 중간 처리
				/*.filter(new Predicate<Member>() {
					@Override
					public boolean test(Member m) {
						return m.getSex()==Member.MALE;
					}
				})*/
			.filter(m -> m.getSex()==Member.MALE)  // 중간처리, 피터링 : 멤버(남자만) <- 멤버(전체)
			/*.mapToInt(new ToIntFunction<Member>() {
				@Override
				public int applyAsInt(Member m) {
					return m.getAge();
				}
			})*/
			//.mapToInt(m -> m.getAge()) // 람다식
			.mapToInt(Member :: getAge)  // 매개변수 메소드 참조, 매칭 int <- Member
			.average()  // 최종 처리
			.getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}


