
public class Ex1228_1 {
	public static void main(String[] args) {
		// try { ���ܰ� �߻��� �� �ִ� �ڵ�} catch (Exception e) { ���ܰ� �߻����� ��� ó���� ����
		//                                               System.out.println(e.toString()); } toString() ����
		
		int arr[] = new int[5];  // ���� �ε��� 5���ִ� �迭����, �迭Ÿ�� int
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			 
		} catch(Exception e) {
			System.out.println(e); // toString()�� ������.
			System.out.println("�� ����(����)�� �߻��� �κ�");
		}
		
		
		
		
		
		
		
		
	}
}
