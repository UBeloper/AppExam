import java.io.FileInputStream;

public class Ex1228_3 {
	public static void main(String[] args) {
		// 스트림 클래스 활용 (파일 읽기)
		FileInputStream fis = null;		

		try {
			fis = new FileInputStream("./bin/reader.txt"); // 오픈!(열기) == 객체생성!
														   // ★ 폴더 'AppExam' 기준이구나.
			int i; // 읽은 바이트값을 저장할 변수
			while ((i = fis.read()) != -1) { /* while : '참'일동안 실행 // read() 읽은 문자의 '수(int)' 실행 */ 
				System.out.print((char)i); // 바이트를 문자로 출력
				// ★★★ 못읽었으면 -1이 나오기 때문에 -1과 비교하는 것.
			}
			// ----------여기까지 파일 처리 구간 -------------
			
			
		} catch(Exception e) {
			System.out.println("1 : " + e);
		} finally {
			if(fis != null) { //파일이 오픈되었다면
				try {
					fis.close();			// 열었으면 닫아줘야한다.
				} catch(Exception e) {
					System.out.println("2 : " + e);
				}
				
			}
		}
		
		
	}
	}
