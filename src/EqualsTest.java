
public class EqualsTest {
	
	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿");
		Student st2 = st1; // ��ü ���� ����, '����'
		System.out.println(st1);
		System.out.println(st2); // st1�� st2 : �ؽ��ڵ�� ���� -> ������ ��ġ�� ��Ÿ����! '������ �� �ν��Ͻ��� ����'
		
		Student st3 = new Student("ȫ�浿");
		System.out.println(st3); // st1�� st3�� �ٸ� ��ü
		
		// equal() �޼ҵ� Ȱ��
		System.out.println("st1 �� st2 �� : " + st1.equals(st2));
		System.out.println("st1 �� st3 �� : " + st1.equals(st3));
		// equals() �޼����� ������ �ؽ��ڵ� ��
		
		// ���� ������ �Ϲݰ�ü�� ��� �������� ��ü�� �ٸ��� �ؽ��ڵ尡 �ٸ�.
		// String�� ��� ����
		// String�� ���ڿ��� ������ ��� ������ �޸𸮿� ����
		// ������ ȿ���� ���
		
		String a1 = new String("ȫ�浿");
		String a2 = new String("ȫ�浿");
		
		System.out.println(a1.hashCode());
		System.out.println(st1 == st3);
		System.out.println(a1 == a2);	   // *** �� ���� ������
		System.out.println(a1.equals(a2)); // ******���ڿ��� ���� ��
		System.out.println(st1.equals(st3));
		
		
	}
}
