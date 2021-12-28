
public class TestMyNumber {
	public static void main(String[] args) {
		// 람다식은 implement 생략 가능
		MyNumber max = (x, y) -> (x >= y) ? x : y; // 인터페이스의 메서드 구현
		System.out.println(max.getMax(10, 15));		
		
		
		
		String s1 = "자바";
		String s2 = "프로그래밍";
		StringConcat concat = (x, y) -> System.out.println(x + " , " + y);
		concat.makeString(s1, s2);
		
	}
}
