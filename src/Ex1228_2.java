import java.io.FileInputStream;

public class Ex1228_2 {
	public static void main(String[] args) {
		// �����Ϸ��� ���� üũ�Ǵ� ����
		FileInputStream fis = null;  // �ڡڡڡڡڡڡڡ�
							  // fis�� ���������� �ٲٱ� ���� try��(���������� �ǹ����� ������)���� ���� ���ϰ�
							  // �ٱ����� �����ϰ� �ȿ��� ��ü ����(�� ������ ����ó��üũ�κ��̹Ƿ�)
		
		try {
		fis = new FileInputStream("a.txt"); // ���� �ҷ��� �� ����ó�� �ʼ�(��Ģ)!!!
											// fis�� ���Ͽ� ������ �� �ִ� ��ü�� �ȴٴ� ��.
		
		// �� �κ��� ����ó���Ǵ� ����
		// ���ҽ� ���� ó��
		
		} catch(Exception e) {
			System.out.println(e);
			// ������ ���� ����
			// ���⿡�� ���ҽ� ���� ó��
		
		} finally {	// �׻� ó���� ����
					// ���� ó���� ������ ���� �ۼ� 
					// ** ����ó�� �ؾ� ��.
			
			// ���� fis�� �����ִ����� �𸣱� ������, ��ü�� �����ִ��� ���� Ȯ��
			if (fis != null) { 
				try {
				fis.close();}
				catch(Exception e) {
//					System.out.println(e);
					e.printStackTrace();   // ���ܰ��� ������� �̷��Ե� ����.
				}
			}
			
		}
		
		System.out.println("�Ϸ�κ��Դϴ�."); // ���� ��Ȳ �߻����� ���α׷� ������� �ʴ´ٴ°� �� �� �ִ� ����
		
		
		
		
		
		
		
		
		
		
	}
	
}
