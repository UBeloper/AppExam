
public class EqualsTest2 {
	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = new Student(100, "홍길동");
		
		System.out.println("연산자 비교 : " + (st1 == st2)); // hashcode 비교 // 쓸일없음.
		System.out.println("메서드 비교 : " + st1.equals(st2)); // hashcode 비교
		
		
		
		// ******* String에 equals가 이미 자체적으로 Student 클래스에 있는것처럼 오버라이딩이 되어있음.
		
		String s1 = new String("호랑이");
		String s2 = new String("호랑이");
		System.out.println(s1 == s2); // 주소비교(hashcode)
		System.out.println(s1.equals(s2)); // 문자열내용비교
		
		
		System.out.println("======================================");
		// String의 저장 위치
		String s4 = "이순신"; // "객.체.생.성" '상수'를 가리키는 방식으로 객체생성
		String s5 = "이순신"; // "객.체.생.성"
		System.out.println(s4 == s5); // 주소비교(hashcode)
		System.out.println(s4.equals(s5)); // 문자열내용비교
		// String객체는 상수를 가리키는 방식으로 객체를 생성했을 때(일반타입처럼 값선언), 상수풀에 저장되면서 주소(hashcode)를 비교해도 true가 나온다.
		

		
		
		// 객체 Integer
		String svalue = "100"; // 문자열, 연산불가능
//		Integer ivalue = new Integer(svalue); // 이방식으로 생성하지 않음
//		int ivalue = (int)svalue; // 이렇게는 형변환을 못함. 기본적으로 같은 기본타입이어야 이렇게 캐스팅이 가능.
		int ivalue = Integer.parseInt(svalue); //매개변수(svalue)는 '정수형태'의 문자열을 갖고있어야 한다.
		System.out.println(ivalue + 1); // 정수화 시켰기때문에, 정수 연산 가능
		
		// 객체 Double
		double dvalue = Double.parseDouble("3.14"); // Wrapper 클래스 - 문자열을 실수화
		System.out.println(dvalue + 10);
		
		
		
		
		
	}
}
