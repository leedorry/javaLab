package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	// List �ڷᱸ�� = �ڷḦ �ε����� �����ϴ� �迭�� ��������� Ȯ���� �� �� �ִ�.
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿", 90, 96),
		new Student("�ſ��", 95, 93)
	);
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		// �͸� ��ü�� �Ű������� �����Ѵ�.
		/*printString(new Function<Student, String>(){
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});*/
		
		// ���ٽ����� �Ű������� �����Ѵ�.
		// Function<Student, String> function = t -> t.getName();
		// printString(function);  // "ȫ�浿 �ſ��"
		printString( t -> t.getName() );   // "ȫ�浿 �ſ��"
		
		System.out.println("[���� ����]");
		printInt( t -> t.getEnglishScore() );  // 90 95
		
		System.out.println("[���� ����]");
		printInt( t -> t.getMathScore() );  // 96 93
	}
}
