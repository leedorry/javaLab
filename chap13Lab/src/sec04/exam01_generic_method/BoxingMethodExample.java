package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();  // Unboxing, int <- Integer
		System.out.println("intValue = "+ intValue);
		
		Box<String> box2 = Util.boxing("홍길동");  // 제너릭 메소드 호출한다.
		String strValue = box2.get();
		System.out.println("strValue = "+ strValue);
	}
}
