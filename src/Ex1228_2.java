import java.io.FileInputStream;

public class Ex1228_2 {
	public static void main(String[] args) {
		// 컴파일러에 의해 체크되는 예외
		FileInputStream fis = null;  // ★★★★★★★★
							  // fis를 전역변수로 바꾸기 위해 try안(지역변수가 되버리기 때문에)에서 직접 안하고
							  // 바깥에서 선언만하고 안에서 객체 생성(이 순간이 예외처리체크부분이므로)
		
		try {
		fis = new FileInputStream("a.txt"); // 파일 불러올 때 예외처리 필수(규칙)!!!
											// fis가 파일에 접근할 수 있는 객체가 된다는 뜻.
		
		// 이 부분은 정상처리되는 영역
		// 리소스 종료 처리
		
		} catch(Exception e) {
			System.out.println(e);
			// 비정상 종료 영역
			// 여기에도 리소스 종료 처리
		
		} finally {	// 항상 처리될 영역
					// 최종 처리할 공통의 내용 작성 
					// ** 예외처리 해야 함.
			
			// 아직 fis가 열려있는지도 모르기 때문에, 객체가 열러있는지 부터 확인
			if (fis != null) { 
				try {
				fis.close();}
				catch(Exception e) {
//					System.out.println(e);
					e.printStackTrace();   // 예외관련 내용출력 이렇게도 가능.
				}
			}
			
		}
		
		System.out.println("완료부분입니다."); // 예외 상황 발생에도 프로그램 종료되지 않는다는걸 알 수 있는 구문
		
		
		
		
		
		
		
		
		
		
	}
	
}
