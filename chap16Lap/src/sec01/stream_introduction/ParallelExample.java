package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");

		// ���� ó��
		Stream<String> stream = list.stream();

		// �͸�����ü
		/*
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				ParallelExample.print(t);
			}
		});*/
		
		// ���ٽ�
		// stream.forEach(t -> ParallelExample.print(t));

		// �޼ҵ� ����
		stream.forEach(ParallelExample :: print);

		System.out.println();

		// ���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
	}

	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
