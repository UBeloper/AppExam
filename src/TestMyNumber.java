
public class TestMyNumber {
	public static void main(String[] args) {
		// ���ٽ��� implement ���� ����
		MyNumber max = (x, y) -> (x >= y) ? x : y; // �������̽��� �޼��� ����
		System.out.println(max.getMax(10, 15));		
		
		
		
		String s1 = "�ڹ�";
		String s2 = "���α׷���";
		StringConcat concat = (x, y) -> System.out.println(x + " , " + y);
		concat.makeString(s1, s2);
		
	}
}
