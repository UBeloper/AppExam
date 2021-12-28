import java.util.*;

// ȸ������ �ٽ� Ŭ����
public class MemberArrayList {
	ArrayList<Member> arrayList; // �������, ����.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member ��ü�� ������ �� �ִ� ����Ʈ ���� 
											 // �ڡڡ� Member�� ���� ������ (�迭)������ ������ִ� ����
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	/*
	public boolean removeMember(Member member) {
		arrayList.remove(member);
		return true;
	}
	*/
//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�   (Member member) '��ü��ü' �� '��ü������ü'�� �� �� ���� ������ �� ��Ҹ� �ϳ��� �� �߰��ϰ� ������ �� ���⶧���� �̷��� �Ⱦ�
	public boolean removeMember(int memberID) {  //���� �����ϸ� true�� ��ȯ�ϰڴٴ� ����. "�ڹ�ȣ�� ��� �������� �����ϰ� ������ false�� �����ϴ� �޼���"!!!!!
		// ����Ǿ� �ִ� '�ڽ�'�� '�����ü', ���빰�� id�� name�� ����. ����� �����ؼ� id�� name�� ���ؼ� ���߿� �����ϰ��� �ִ°� ������ �����ϸ� ��.
		// ����°���� �����ϰ��� �ϴ°� ������ �������� �Ⱥ��� ��. �׷��� �ݺ�ó�� �ߴ�.
		// "���������� ã�Ƴ����� ����"
		for(int i = 0; i < arrayList.size(); i++) {
			Member tmp = arrayList.get(i);     //��ü�迭�� ����� ��� ���� ���Ŭ������ �ʵ尪�� �����ϱ� �ű⼭ id��ȣ�� temp id�� ��Ƴ����� member��ü �ϳ��ϳ��� memberid�� �Էµ�.
			int tempID = tmp.getMemberID();	  // ������ removemember(���ڰ�)�� �ְ� if���� ������ �����ϴ� ��� (������ �����Ѵ�.) 
			if(tempID == memberID) {		// >> �� ���� �ڡڡڡ� if(tmp.getMemberID == MemberID) {}
				arrayList.remove(i); 	//��ü ����
				
				 // break��� �� �����ϰ� Ż��
				return true;
				
			}	
		}
		return false;
	}
	
	//�߾��� �� �޼ҵ� �����ε�!!!!��
	// �����Ѱ�
	/*
	public boolean removeMember(String memberName) {  
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);      
			String tempName = member.getMemberName();
			if(tempName.equals(memberName)) {
				arrayList.remove(i);
				return true;
			}	
		}
		return false;
	}
	*/
	
	// �����Ѱ�
	public boolean removeMember(String memberName) { // ���� �����ϸ� true ��ȯ
		boolean chk = false; //�ϴ� ���ж�� ����
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if(member.getMemberName().equals(memberName)) {
				arrayList.remove(i);
				chk = true; // ��������
				break;
			}
		}
		return chk; //������ ��� true, ������ ��� false
	}
	
	
	
	
	
	
	public void showAllMember() {
		for /* (�κ��� �����ü : ����Ʈ������) */ (Member member : arrayList) {
			System.out.println(member); 
			// member.toString() �޼���� ������ ���
		}
	}
	
	
	
	
}