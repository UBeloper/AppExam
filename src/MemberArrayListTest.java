
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memList = new MemberArrayList();
		Member m1 = new Member(100, "ȫ�浿");
		Member m2 = new Member(200, "����ȫ");
		Member m3 = new Member(300, "��ȫ��");
		Member m4 = new Member(400, "ȫ����");
		Member m5 = new Member(500, "��ȫ��");
		
		memList.addMember(m1);
		memList.addMember(m2);
		memList.addMember(m3);
		memList.addMember(m4);
		memList.addMember(m5);
		
		memList.showAllMember();
		
		memList.removeMember(300);
		
		memList.showAllMember();
		
		memList.removeMember(600);
		
		if (memList.removeMember(300) == true) {
			System.out.println("���� �ſ�");
		} else {
			System.out.println("���� �ȵſ�");
		}
		
		System.out.println(memList.removeMember(300));
		
		// �޼ҵ� �����ε� �̿� - �̸����� ����
		if(memList.removeMember("ȫ����") == true) {
			System.out.println("���� �ſ�");
		} else {
			System.out.println("���� �ȵſ�");
		};
		
		System.out.println(memList.removeMember("ȫ����"));
		System.out.println(memList.removeMember("ȫ�浿"));
		
		
		
	}
}
