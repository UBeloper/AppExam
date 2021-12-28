import java.io.FileInputStream;

public class Ex1228_5 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("./bin/test.txt");
		int i;
		while((i = fis.read()) != -1) // while안에 뭐라도 있으면
		{ System.out.print((char)i);} // 이렇게해도 그냥 잘 나오는구나 띄어쓰기 알아서 하고.
										// 엔터에도 아스키코드 값이 있다니 신기허구먼
		} 
		catch(Exception e) {
			System.out.println("첫 캐치문 : " + e);
		} finally {
			if(fis != null) {
				try {
					fis.close(); // 읽을 땐 상관없는데, 쓸 때 열려있으면 오류가 날 수 있기때문에 잘 닫아줘야함.
				} catch(Exception e) {
					System.out.println("finally 내 캐치문 : " + e);
				}
			}
		}

	}

}
