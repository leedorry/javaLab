package sec05.stream_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()  // �߰� ó�� : ����(int -> double)
			.forEach(d -> System.out.println(d));
			
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()  // �߰� ó�� : ����(int -> Integer)
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
