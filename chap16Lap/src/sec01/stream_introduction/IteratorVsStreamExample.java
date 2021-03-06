package sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
		
		// 익명구현객체를 매개변수로 사용한다.
		/*stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}
		});*/
	}
}
