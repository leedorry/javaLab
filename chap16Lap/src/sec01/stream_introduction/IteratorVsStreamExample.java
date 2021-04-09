package sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		
		//Iterator �̿�
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//Stream �̿�
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
		
		// �͸�����ü�� �Ű������� ����Ѵ�.
		/*stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}
		});*/
	}
}
