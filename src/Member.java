
public class Member {
	// �⺯
	private int memberID;
	private String memberName;
	
	// ������
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		System.out.println("��ü�����ϸ� �̰͵� ��µɱ�?");
	}
	
	//get method
	public int getMemberID() {
		return this.memberID;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	//set method
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override // �ֳ����̼� �����ָ� �˾Ƽ� ���������� ����. ����Ŭ����(object)�� �����ؼ� ��������.
	public String toString() {
		return memberID + " : " + memberName;
	}
	// toString�� '����'�� Ư���� �̿��ؼ�, ��ü������ �� �޼��带 ȣ�Ⱑ���ϹǷ� �̷��� �������̵��� ���ذ���. ���� �����ְ� ������.

	
	
}
