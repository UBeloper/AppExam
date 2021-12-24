
public class Member {
	// 멤변
	private int memberID;
	private String memberName;
	
	// 생성자
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		System.out.println("객체생성하면 이것도 출력될까?");
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
	
	@Override // 애너테이션 적어주면 알아서 문법교정을 해줌. 상위클래스(object)를 참고해서 교정해줌.
	public String toString() {
		return memberID + " : " + memberName;
	}
	// toString의 '생략'의 특성을 이용해서, 객체명만으로 이 메서드를 호출가능하므로 이렇게 오버라이딩을 해준거임. 좀더 쓸모있게 쓰려고.

	
	
}
