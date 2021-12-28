
public class Ex1228_1 {
	public static void main(String[] args) {
		// try { 예외가 발생할 수 있는 코드} catch (Exception e) { 예외가 발생했을 경우 처리할 문장
		//                                               System.out.println(e.toString()); } toString() 생략
		
		int arr[] = new int[5];  // 공간 인덱스 5개있는 배열생성, 배열타입 int
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			 
		} catch(Exception e) {
			System.out.println(e); // toString()은 생략됨.
			System.out.println("↑ 예외(오류)가 발생한 부분");
		}
		
		
		
		
		
		
		
		
	}
}
