import java.io.FileInputStream;

public class Ex1228_5 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream("./bin/test.txt");
		int i;
		while((i = fis.read()) != -1) // while�ȿ� ���� ������
		{ System.out.print((char)i);} // �̷����ص� �׳� �� �����±��� ���� �˾Ƽ� �ϰ�.
										// ���Ϳ��� �ƽ�Ű�ڵ� ���� �ִٴ� �ű��㱸��
		} 
		catch(Exception e) {
			System.out.println("ù ĳġ�� : " + e);
		} finally {
			if(fis != null) {
				try {
					fis.close(); // ���� �� ������µ�, �� �� ���������� ������ �� �� �ֱ⶧���� �� �ݾ������.
				} catch(Exception e) {
					System.out.println("finally �� ĳġ�� : " + e);
				}
			}
		}

	}

}
