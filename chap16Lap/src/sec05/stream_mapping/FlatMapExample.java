package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream()
			.flatMap(new Function<String, Stream<String>>() {
				@Override
				public Stream apply(String data) {
					return Arrays.stream(data.split(" "));
				}
			})
		//	.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()

		/*.flatMapToInt(new Function<String, IntStream>(){
			@Override
			public IntStream apply(String data) {
				String[] strArr = data.split(",");  // {"10", "20". "30"}
				int[] intArr = new int[strArr.length];  // {10, 20, 30}
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			}
		})*/
			.flatMapToInt(data -> {  // �߰�ó�� : ��Ī (String -> IntStream)
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number));
	}
}