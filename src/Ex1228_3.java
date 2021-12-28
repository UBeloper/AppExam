import java.io.FileInputStream;

public class Ex1228_3 {
	public static void main(String[] args) {
		// ��Ʈ�� Ŭ���� Ȱ�� (���� �б�)
		FileInputStream fis = null;		

		try {
			fis = new FileInputStream("./bin/reader.txt"); // ����!(����) == ��ü����!
														   // �� ���� 'AppExam' �����̱���.
			int i; // ���� ����Ʈ���� ������ ����
			while ((i = fis.read()) != -1) { /* while : '��'�ϵ��� ���� // read() ���� ������ '��(int)' ���� */ 
				System.out.print((char)i); // ����Ʈ�� ���ڷ� ���
				// �ڡڡ� ���о����� -1�� ������ ������ -1�� ���ϴ� ��.
			}
			// ----------������� ���� ó�� ���� -------------
			
			
		} catch(Exception e) {
			System.out.println("1 : " + e);
		} finally {
			if(fis != null) { //������ ���µǾ��ٸ�
				try {
					fis.close();			// �������� �ݾ�����Ѵ�.
				} catch(Exception e) {
					System.out.println("2 : " + e);
				}
				
			}
		}
		
		
	}
	}
