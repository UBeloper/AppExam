
public class EqualsTest2 {
	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿");
		Student st2 = new Student(100, "ȫ�浿");
		
		System.out.println("������ �� : " + (st1 == st2)); // hashcode �� // ���Ͼ���.
		System.out.println("�޼��� �� : " + st1.equals(st2)); // hashcode ��
		
		
		
		// ******* String�� equals�� �̹� ��ü������ Student Ŭ������ �ִ°�ó�� �������̵��� �Ǿ�����.
		
		String s1 = new String("ȣ����");
		String s2 = new String("ȣ����");
		System.out.println(s1 == s2); // �ּҺ�(hashcode)
		System.out.println(s1.equals(s2)); // ���ڿ������
		
		
		System.out.println("======================================");
		// String�� ���� ��ġ
		String s4 = "�̼���"; // "��.ü.��.��" '���'�� ����Ű�� ������� ��ü����
		String s5 = "�̼���"; // "��.ü.��.��"
		System.out.println(s4 == s5); // �ּҺ�(hashcode)
		System.out.println(s4.equals(s5)); // ���ڿ������
		// String��ü�� ����� ����Ű�� ������� ��ü�� �������� ��(�Ϲ�Ÿ��ó�� ������), ���Ǯ�� ����Ǹ鼭 �ּ�(hashcode)�� ���ص� true�� ���´�.
		

		
		
		// ��ü Integer
		String svalue = "100"; // ���ڿ�, ����Ұ���
//		Integer ivalue = new Integer(svalue); // �̹������ �������� ����
//		int ivalue = (int)svalue; // �̷��Դ� ����ȯ�� ����. �⺻������ ���� �⺻Ÿ���̾�� �̷��� ĳ������ ����.
		int ivalue = Integer.parseInt(svalue); //�Ű�����(svalue)�� '��������'�� ���ڿ��� �����־�� �Ѵ�.
		System.out.println(ivalue + 1); // ����ȭ ���ױ⶧����, ���� ���� ����
		
		// ��ü Double
		double dvalue = Double.parseDouble("3.14"); // Wrapper Ŭ���� - ���ڿ��� �Ǽ�ȭ
		System.out.println(dvalue + 10);
		
		
		
		
		
	}
}
