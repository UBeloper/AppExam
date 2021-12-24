
public class EqualsTest {
	
	public static void main(String[] args) {
		Student st1 = new Student("홍길동");
		Student st2 = st1; // 객체 대입 가능, '복사'
		System.out.println(st1);
		System.out.println(st2); // st1과 st2 : 해쉬코드상 같음 -> 동일한 위치를 나타낸다! '생성된 두 인스턴스가 같다'
		
		Student st3 = new Student("홍길동");
		System.out.println(st3); // st1과 st3은 다른 객체
		
		// equal() 메소드 활용
		System.out.println("st1 과 st2 비교 : " + st1.equals(st2));
		System.out.println("st1 과 st3 비교 : " + st1.equals(st3));
		// equals() 메서드의 원형은 해시코드 비교
		
		// 위의 설명에서 일반객체일 경우 설명내용대로 객체가 다르면 해시코드가 다름.
		// String일 경우 예외
		// String의 문자열이 동일할 경우 동일한 메모리에 저장
		// 기억장소 효율적 사용
		
		String a1 = new String("홍길동");
		String a2 = new String("홍길동");
		
		System.out.println(a1.hashCode());
		System.out.println(st1 == st3);
		System.out.println(a1 == a2);	   // *** 이 문장 사용금지
		System.out.println(a1.equals(a2)); // ******문자열의 내용 비교
		System.out.println(st1.equals(st3));
		
		
	}
}
